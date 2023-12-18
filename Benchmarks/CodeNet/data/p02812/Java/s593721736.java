import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); sc.nextLine();
        String S = sc.nextLine();
        int res = S.split("ABC").length - 1;
        System.out.println(res);
    }
}
