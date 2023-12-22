import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0 ; i < N; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int trg = a[i];
            int j = i - 1;
            while (j >= 0 && trg < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = trg;
            for (int b: a)
                System.out.printf("%d ", b);
            System.out.println();
        }
    }
}