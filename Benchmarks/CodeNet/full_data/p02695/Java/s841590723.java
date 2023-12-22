import java.io.*;
import java.util.*;

public class Main {

        static int N;
        static int M;
        static int Q;

        static int[] a;
        static int[] b;
        static int[] c;
        static int[] d;

        static int Anumber = 0;
        static int count = 0;
        static int[] A;
        static int max = 0;

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                N = scan.nextInt();
                M = scan.nextInt();
                Q = scan.nextInt();

                a = new int[Q];
                b = new int[Q];
                c = new int[Q];
                d = new int[Q];

                for (int i = 0; i < Q; i++) {
                        a[i] = scan.nextInt();
                        b[i] = scan.nextInt();
                        c[i] = scan.nextInt();
                        d[i] = scan.nextInt();
                }

                A = new int[N];

                Main.Aselect(1);

                System.out.println(max);


        }


        private static void Aselect(int first) {
                if (Anumber == N-1) {
                        for (int j = first; j <= M; j++) {
                                A[Anumber] = j; 

                                for (int i = 0; i < Q; i++) {
                                        if (A[b[i]-1]-A[a[i]-1] == c[i]) {
                                                count += d[i];
                                        }
                                }

                                if (max < count) {
                                        max = count;
                                }

                                count = 0;
                        }
                } else {
                        for (int j = first; j <= M; j++) {
                                A[Anumber] = j;
                                Anumber++;
                                Aselect(j);
                                Anumber--;
                        }
                }
        }

}