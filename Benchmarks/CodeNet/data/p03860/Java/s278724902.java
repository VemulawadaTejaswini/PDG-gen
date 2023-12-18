import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String AtCoder = sc.next();
        String s = sc.next();
        String Contest = sc.next();

        String AsC = AtCoder.substring(0, 1) + s.substring(0, 1) + Contest.substring(0, 1);

        System.out.println(AsC);

    }
}