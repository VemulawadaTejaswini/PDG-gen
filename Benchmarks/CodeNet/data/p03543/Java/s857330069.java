import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean result =
                (N%1000)%111 == 0 || (N/10)%111 == 0 ;

        System.out.println(result ? "Yes":"No");
        }
}
