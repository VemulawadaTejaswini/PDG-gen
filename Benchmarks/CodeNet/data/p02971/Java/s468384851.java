import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != max)
                System.out.println(max);
            else {
                int emax = a[0];
                for (int j = 1; j < a.length; j++) {
                    if (a[j] == a[i])
                        ;
                    else if (emax < a[j])
                        emax = a[j];
                }
                System.out.println(emax);
            }
        }
    }
}