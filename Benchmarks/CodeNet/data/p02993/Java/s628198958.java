import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        boolean ans = true;
        int[] num = new int[10];
        
        for (int i = 0; i < s.length(); i++) {
            int n = (int)s.charAt(i);
            if (++num[n] > 1) {
                ans = false;
                break;
            }
        }
        
        System.out.println(ans ? "Good" : "Bad");
    }
}