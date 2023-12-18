import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

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
            if(this.a > aite.a)return 1;
            if(this.a < aite.a)return -1;
            if(this.b > aite.b)return 1;

            return 0;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        int N = scanner.nextInt();
        pair[] A = new pair[N];
        pair[] B = new pair[N];

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

        int ok = 0;
        int now = 0;
        int[] map = new int[N];

        for (int i = 0; i < N; i++) {
            int min = 9999;
            int mmiinn = -1;
            for (int j = 0; j < N; j++) {
                if(A[i].a < B[j].a && A[i].b < B[j].b && map[j] == 0){
//                    System.out.println(i +" -- " + j);

                    min = Math.min(Math.min(B[j].a - A[i].a, B[j].b - A[i].b), min);
                    if(min == Math.min(B[j].a - A[i].a, B[j].b - A[i].b))mmiinn = j;
                }
            }
            if(mmiinn != -1){
//                System.out.println(mmiinn);
                ok++;
                map[mmiinn] = 1;
            }
        }



        System.out.println(ok);
    }

}