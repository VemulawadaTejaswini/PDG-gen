import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        String[] ans = s.split("ABC");
        System.out.println(ans.length - 1);
    }
}
