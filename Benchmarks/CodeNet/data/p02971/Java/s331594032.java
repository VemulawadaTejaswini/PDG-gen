import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            int max = 0;
            for(int j=0; j<N; j++){
                if(i==j) continue;
                max = Math.max(max, A[j]);
            }
            println(max);
        }
    }

    static void println(Object o){
        System.out.println(o);
    }
   static void print(Object o){
        System.out.print(o);
    }
}
