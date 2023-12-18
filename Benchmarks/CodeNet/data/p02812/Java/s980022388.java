import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int ans = 0;
        for(int i = 0; i < n - 2; i++) {
            if(s[i] == 'A' && s[i + 1] == 'B' && s[i + 2] == 'C') ans++;
        }
        System.out.println(ans);
    }
}
