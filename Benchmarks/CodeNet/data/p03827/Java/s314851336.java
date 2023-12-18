import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArray = sc.next().split("");
        for (String s : strArray) {
           if (s.equals("I")) {
               x += 1;
           } else {
               x -= 1;
           }
           ans = Math.max(ans, x);
        }
        System.out.println(ans);
    }
}
