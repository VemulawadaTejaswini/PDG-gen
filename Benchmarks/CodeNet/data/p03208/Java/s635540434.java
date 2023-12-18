import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            h[i] = sc.nextInt();
            list.add(h[i]);
        }

        Collections.sort(list);
        int min = list.get(N-1);

        for(int i=0; i<N-K+1; i++){
            min = Math.min(min, list.get(i+K-1)-list.get(i));
        }
        System.out.println(min);
    }
}