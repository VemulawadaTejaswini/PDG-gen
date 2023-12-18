import java.util.Scanner;

public class Main {
    public static int A;
    public static int B;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        int max;

        if (A + B < A - B) max = A - B;
        else max = A + B;

        if (max < A * B) max = A * B;

        System.out.println(max);
    }
}