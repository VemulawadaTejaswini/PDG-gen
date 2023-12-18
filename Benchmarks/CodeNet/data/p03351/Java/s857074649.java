import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String ans = "Yes";
        int dir = Math.abs(c-a);
        int ind = Math.max(Math.abs(b-a),Math.abs(c-b));
        if(dir>d&&ind>d) ans = "No";


        System.out.println(ans);
    }
}