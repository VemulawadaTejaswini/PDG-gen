import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[] s = sc.nextLine().toCharArray();
        sc.close();

        int cnt = 0;
        int ans = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<s.length; j++) {
                if(i == j) {
                    continue;
                } else {
                    if(i < j) {
                        if(s[j] == 'E') {
                            cnt++;
                        }
                    } else {
                        if(s[j] == 'W') {
                            cnt++;
                        }
                    }
                }
            }
            if(i == 0) {
                ans = cnt;
            }
            if(ans > cnt) {
                ans = cnt;
            }
            cnt = 0;
        }
        System.out.println(ans);
    }
}
