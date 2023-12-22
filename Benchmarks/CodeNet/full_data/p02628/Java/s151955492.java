import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner( System.in );

        int N = Integer.parseInt( scan.next() );
        int K = Integer.parseInt( scan.next() );

        int[] p = new int[N];

        for (int i=0; i< p.length; i++){
            p[i] = Integer.parseInt( scan.next() );
        }
        Arrays.sort(p);

        int sum = 0;
        for(int i=0; i<K; i++){
            sum += p[i];
        }
        System.out.println(sum);

    }
}