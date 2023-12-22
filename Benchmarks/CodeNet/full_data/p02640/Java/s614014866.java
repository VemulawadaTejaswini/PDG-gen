import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        int tsuru = 0;
        int kame = 0;
        String answer = "Yes";

        if (y == 1) {
            answer = "no";
        } else if (y % 2 == 1) {
            answer = "No";
        } else if (x * 2 > y) {
            answer = "No";
        } else if (x * 4 < y) {
            answer = "No";
        } else if (((x * 4 - y) / 2) > x) {
            answer = "No";
        }
        
        System.out.println(answer);
    }
}