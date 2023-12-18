import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        PriorityQueue<Long> monsters = new PriorityQueue<>(Collections.reverseOrder());
        for(int n=0; n<N; n++) monsters.add(sc.nextLong());
        int k=0;
        long ans = 0;
        while(!monsters.isEmpty()){
            long m = monsters.poll();
            if(k<K){
                k++;
            }else{
                ans += m;
            }
        }
        System.out.println(ans);
    }
}
