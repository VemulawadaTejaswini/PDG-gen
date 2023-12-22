import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
        String answer = "NO";
        
        if ((w < v) && (Math.abs(a - b) <= (v - w) * t)) {
            answer = "YES";
        }
        if ((a < b) && (Math.abs(1000000000 - b) <= w * t) && ((Math.abs(1000000000 - a) - (w * t - Math.abs(1000000000 - b))) <= v * t)) {
            answer = "YES";
        }
        if ((b < a) && (Math.abs(b - 1000000000) <= w * t) && ((Math.abs(a - 1000000000) - (w * t - Math.abs(b - 1000000000))) <= v * t)) {
            answer = "YES";
        }
        System.out.println(answer);
    }
}