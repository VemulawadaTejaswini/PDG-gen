import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int A[] = new int[b];
        int sum =0;
        for (int i = 0; i < b; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
        if (a <= sum ) {
            System.out.printf("Yes");
        }else{
            System.out.printf("No");
        }
    }
}
