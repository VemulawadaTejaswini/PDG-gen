import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt() , k = sc.nextInt();
        String s = "a";
        int result = 0;
        for (int i = 0; i < k; i++) {
            if (s == "a") {
                result++;
                a--;
                if (a == 0) s = "b";
            }
            else if (s == "b") {
                b--;
                if (b == 0) s = "c";
            } else if (s == "c") {
                result--;
            }
        }
        System.out.println(result);
    }
}