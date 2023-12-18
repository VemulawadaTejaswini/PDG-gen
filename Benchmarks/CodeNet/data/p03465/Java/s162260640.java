import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sumA = 0;
        int sumB = 0;
        
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        
        for (int i = k-1; i >= 0; i--) {
            if (sumA > sumB)
                sumB += a[i];
            else
                sumA += a[i];
        }
        
        System.out.println(Math.max(sumA, sumB));
    }
}