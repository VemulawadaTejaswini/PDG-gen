import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        long ans = s.chars().filter(e -> e == '1').count();
        System.out.println(ans);
    }
}
