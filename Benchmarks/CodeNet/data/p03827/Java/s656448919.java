import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I') {
                count++;
            } else {
                count--;
            }
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
    }
}