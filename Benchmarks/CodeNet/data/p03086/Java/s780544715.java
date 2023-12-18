import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int ans = 0;
        for (int i = 0; i < s.length-1; i++) {
            if (s[i] == 'A' || s[i] == 'C' || s[i] == 'G' || s[i] == 'T') {
                int temp = 1;
                for (int j = i+1; j < s.length; j++) {
                    if (s[j] == 'A' || s[j] == 'C' || s[j] == 'G' || s[j] == 'T') {
                        temp += 1;
                    } else {
                        break;
                    }
                } ans = Math.max(ans, temp);
            }
        } System.out.println(ans);
    }
}
