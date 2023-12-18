import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int plus_max=0;
        int plus_max_index=-1;
        int minus_min=0;
        int minus_min_index=-1;
        for (int i=0;i<N;i++) {
            A[i] = Integer.parseInt(sc.next());
            if (A[i]>0) {
                if (A[i]>plus_max) {
                    plus_max = A[i];
                    plus_max_index = i;
                }
            } else {
                if (A[i]<minus_min) {
                    minus_min = A[i];
                    minus_min_index = i;
                }
            }
        }
        if (plus_max+minus_min>=0) {
            for (int i=0;i<N;i++) {
                System.out.println((plus_max_index+1) + " " + (i+1));
            }
            for (int i=0;i<N-1;i++) {
                System.out.println((i+1) + " " + (i+2));
            }
        } else {
            for (int i=0;i<N;i++) {
                System.out.println((minus_min_index+1) + " " + (i+1));
            }
            for (int i=N-1;i>0;i--) {
                System.out.println((i+1) + " " + (i));
            }
        }
    }
}