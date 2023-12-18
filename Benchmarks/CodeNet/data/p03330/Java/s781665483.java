import java.util.*;
import java.lang.*;

class Counter<T> extends TreeMap<T,Long>{
    public Counter(){
        super();
    }
    public Long count(Object elm){
        return getOrDefault(elm,0L);
    }
    public void add(T elm, long amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[][] D = new int[C][C];
        for(int x=0; x<C; x++) for(int y=0; y<C; y++) D[x][y]=sc.nextInt();

        int[][] grid = new int[N][N];
        for(int r=0; r<N; r++) for(int c=0; c<N; c++) grid[r][c]=sc.nextInt()-1;

        Counter<Integer>[] colorCount = new Counter[3];
        for(int p=0;p<3;p++) colorCount[p]=new Counter<>();
        for(int r=0; r<N; r++) for(int c=0; c<N; c++) colorCount[(r+c)%3].add(grid[r][c],1);
        
        int ans = Integer.MAX_VALUE;
        for(int c0=0; c0<C; c0++) for(int c1=0; c1<C; c1++) for(int c2=0; c2<C; c2++){
            if(c0!=c1 && c1!=c2 && c2!=c0){
                int wrongness = 0;
                for(int c=0; c<C; c++){
                    wrongness += D[c][c0] * colorCount[0].count(c);
                    wrongness += D[c][c1] * colorCount[1].count(c);
                    wrongness += D[c][c2] * colorCount[2].count(c);
                }
                ans = Math.min(ans, wrongness);
            }
        }
        System.out.println(ans);


    }
}
