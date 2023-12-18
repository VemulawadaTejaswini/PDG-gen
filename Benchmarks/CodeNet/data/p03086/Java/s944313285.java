import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        int ans = 0;
        for(int i=0; i<s.length; i++) {
            if(s[i] == 'T') {
                int start = 0;
                int end = 0;
                for(int j=i-1; j>=0; j--) {
                    if(s[j] == 'A' || s[j] == 'C' || s[j] == 'G') {
                    } else {
                        start = j+1;
                        break;
                    }
                }
                for(int k=i+1; k<s.length; k++) {
                    if(s[k] == 'A' || s[k] == 'C' || s[k] == 'G') {
                    } else {
                        end = k-1;
                        break;
                    }
                }
                ans = Math.max(end-start+1, ans);
            }
        }
        System.out.println(ans);
    }
}
