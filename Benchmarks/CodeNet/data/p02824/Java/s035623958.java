import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        int N = nextInt(r);
        long M = nextLong(r);
        int V = nextInt(r);
        int P = nextInt(r);
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = nextInt(r);
            sort(A, i);
        }

        int b_a = 0;
        for (int i = N-P; i > 0; i--) {
            if (A[i] > A[i-1]) {
                b_a = i;
                break;
            }
        }
        int b_n = A[b_a];

        int ans = N - b_a;
        for (int i = 0; i < b_a; i++) {
            if (A[i]+M >= b_n) {
                if (i+1 >= V) {
                    ans = N-i;
                    break;
                } else {
                    if (N-(V-(i+1)) > b_a) {
                        if (A[i]+M > b_n) {
                            ans = N-i;
                            break;
                        } else {
                            if (A[N-(V-(i+1))] > b_n) {
                                ans = N-i;
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int nextInt(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return Integer.parseInt(str);
    }

    public static long nextLong(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return Long.parseLong(str);
    }

    public static void sort(int[] A, int i) {
        for (int j = i; j > 0; j--) {
            if (A[j] < A[j-1]) {
                int tmp = A[j-1];
                A[j-1] = A[j];
                A[j] = tmp;
            } else {
                break;
            }
        }
    }
}
