import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {
    static int N;
    static pair[] A;
    static pair[] B;
    static int ans = 0;


    static class pair implements Comparable{
            public int a;
            public int b;

            pair(){
                this.a = 0;
                this.b = 0;
            }

            pair(int a, int b){
                this.a = a;
                this.b = b;
            }

            public void set(int a, int b) {
                this.a = a;
                this.b = b;
            }

        @Override
        public int compareTo(Object o) {
            pair aite = (pair)o;
            if(this.a < aite.a && this.b < aite.b)return 1;
            return -1;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        A = new pair[N];
        B = new pair[N];

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            A[i] = new pair(a, b);
        }
        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            B[i] = new pair(a, b);
        }

        Arrays.sort(A);
        Arrays.sort(B);
        boolean[] temp = new boolean[N];

        iter(0, temp);

        System.out.println(ans);


    }

    static void iter(int n, boolean[] map){
        if(n >= N){
            int x = 0;
            for (int i = 0; i < N; i++) {
                if(map[i] == true)x++;
            }
            ans = Math.max(ans, x);
            return;
        }


        for (int i = 0; i < N; i++) {
            if(A[n].compareTo(B[i]) > 0){
//                System.out.println(i +" lll " + n);
                if(map[i] == false){

                    map[i] = true;
                    iter(n + 1, map);
                    map[i] = false;
                }
            }
            iter(n + 1, map);
        }
    }

}