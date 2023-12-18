import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        int ans = 0;
        for(int i=0; i<s.length; i++) {
            int cnt = 0;
            if(s[i] == 'T') {
                cnt++;
                for(int j=i-1; j>=0; j--) {
                    if(s[j] == 'A' || s[j] == 'C' || s[j] == 'G') {
                        cnt++;
                    } else {
                        break;
                    }
                }
                for(int k=i+1; k<s.length; k++) {
                    if(s[k] == 'A' || s[k] == 'C' || s[k] == 'G') {
                        cnt++;
                    } else {
                        break;
                    }
                }
                ans = Math.max(cnt, ans);
            }
        }
        System.out.println(ans);
    }
}
