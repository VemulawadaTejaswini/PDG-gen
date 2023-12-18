import java.io.*;
import java.util.*;

public class Main {

        static int max = 0;

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                int M = scan.nextInt();
                int Q = scan.nextInt();

                int[] a = new int[Q];
                int[] b = new int[Q];
                int[] c = new int[Q];
                int[] d = new int[Q];

                for (int i = 0; i < Q; i++) {
                        a[i] = scan.nextInt();
                        b[i] = scan.nextInt();
                        c[i] = scan.nextInt();
                        d[i] = scan.nextInt();
                }

                int Anumber = 0;
                int count = 0;
                int first = 1;
                int[] A = new int[N];

                Main.Aselect(Anumber, N, Q, a, b, c, d, count, 1, M, A);

                System.out.println(max);


        }


        private static void Aselect(int Anumber, int N, int Q, int[] a, int[] b, int[] c, int[] d, int count, int first, int M, int[] A) {
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
                                Aselect(Anumber, N, Q, a, b, c, d, count, j, M, A);
                                Anumber--;
                        }
                }
        }

}