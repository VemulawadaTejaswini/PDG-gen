import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans = "";
        while(num != 0) {
            if(num % 2 != 0) {
                ans = "1" + ans;
                num--;
            } else {
                ans = "0" + ans;
            }
            num /= (-2);
        }
        if(ans.length() == 0) ans = "0";
        System.out.println(ans);
    }
}