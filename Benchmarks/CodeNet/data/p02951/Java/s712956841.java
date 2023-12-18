import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++){
            H[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            if ((H[i] - H[min_index(H, i)]) > 1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
        
    }

    static int min_index(int[] a, int t) {
        int min = a[t];
        int index = t;
        for (int i = t; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                index = i;
            }
        }
        return index;
    }
}