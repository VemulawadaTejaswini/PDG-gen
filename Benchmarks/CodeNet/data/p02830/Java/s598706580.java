import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        String t = scan.next();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++) {
        	ans.append(s.substring(i, i + 1));
        	ans.append(t.substring(i, i + 1));
        }

        System.out.println(ans.toString());
    }
}