import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String ans = "Good";
        for (int i = 1; i < 3; i++) {
            if (n.charAt(i) == n.charAt(i-1)) {
                ans = "Bad";
                break;
            }
        }
        System.out.println(ans);
    }
}

