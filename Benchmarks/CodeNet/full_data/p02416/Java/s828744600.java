import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num != 0) {
            int ans = 0;
            String[] numbers = String.valueOf(num).split("");
            for (String n : numbers) {
                ans += Integer.parseInt(n);
            }
            out.println(ans);
            num = scan.nextInt();
        }
    }   
}   