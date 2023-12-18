import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

class Counter<T> extends HashMap<T,Integer>{
    public Counter(){
        super();
    }
    public Integer get(Object elm){
        return getOrDefault(elm,0);
    }
    public void add(T elm, int amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
    }
    public void addOne(T elm){
        add(elm, 1);
    }
    public void remove(T elm, int amount){
        replace(elm, Math.max(get(elm)-amount, 0));
    }
    public void removeOne(T elm){
        remove(elm, 1);
    }
}

public class Main {
    public static void main(String[] args) {
        //whenever Tak hold, Aok can hold and end the game.
        //Therefore, Tak's best strategy is "Always move"!



        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        LinkedList<Integer>[] block = new LinkedList[W];
        for(int w=0; w<W; w++) {
            block[w] = new LinkedList<>();
            block[w].add(W);
        }
        for(int n=0; n<N; n++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            block[y].add(x);
        }
        for(int w=0; w<W; w++) Collections.sort(block[w]);
        
        int ans = 1000000;
        int curX = 0;
        for(int w=0; w<W; w++){
            curX++;
            //System.err.println(curX+" "+w);
            while(block[w].peek()<curX) block[w].poll();
            //System.err.println(block[w].peek());
            ans = Math.min(ans, block[w].peek());

            while(w<W-1 && block[w+1].contains(curX)) curX++;
            if(curX >= block[w].peek()) break;
        }

        System.out.println(ans);


    }
}