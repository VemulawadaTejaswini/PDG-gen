import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        String sub  = s.replaceAll(s,"");
        int ans = (n - sub.length())/2;
        System.out.println(ans);
    }
}