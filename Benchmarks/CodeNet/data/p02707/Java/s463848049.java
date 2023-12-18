import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] next=new int[N+1];
        
        for(int i=0;i<N-1;i++){
            int cur=sc.nextInt();
            next[cur]++;
        }
        
        for(int i=1;i<N+1;i++){
            System.out.println(next[i]+" ");
        }
    }
}
