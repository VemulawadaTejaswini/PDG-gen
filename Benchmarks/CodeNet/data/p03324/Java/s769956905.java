import java.util.Scanner;

public class b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        sc.close();
        System.out.println(Math.pow(100, D) * N);
    }
}