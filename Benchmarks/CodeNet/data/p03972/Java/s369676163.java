import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    ArrayList<Integer>[] graph;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        PriorityQueue<int[]> pq = new PriorityQueue<>(H+W,new myC());
        int[] p = new int[W], q = new int[H];
        for(int i=0;i<W;i++) pq.add(new int[]{sc.nextInt(),1});
        for(int i=0;i<H;i++) pq.add(new int[]{sc.nextInt(),2});
        long ans = 0;
        while(pq.size()>0){
            int[] cur = pq.poll();
            if(cur[1]==1){
                ans += ((long)cur[0])*((long)H+1);
                W--;
            } else{
                ans += ((long)cur[0])*((long)W+1);
                H--;
            }
        }
        System.out.println(ans);
    }
    static class myC implements Comparator<int[]>{
        // int[]{price,direction} direction: 1=hori, 2=vert
        public int compare(int[] a, int[] b){
            return a[0]-b[0];
        }
    }
}
