import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      	int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(shoppingWithDiscount(A));
    }

    private static int shoppingWithDiscount(int[] a) {
        int totalBill = 0;
        int highest = 0;
        for (int i = 0; i < a.length; i++) {
            totalBill += a[i];
            if (highest < a[i]) {
                highest = a[i];
            }
        }

        return totalBill - highest + highest/2;
    }
}