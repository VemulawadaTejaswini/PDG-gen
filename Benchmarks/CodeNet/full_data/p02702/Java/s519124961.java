import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int ans = 0;
        for (int i=0;i<=(s.length()-4);i++) {
            for (int j=(i+4);j<=(s.length());j++) {
                String ssub = s.substring(i, j);
                long total=0;
                for (int k=0;k<ssub.length();k+=15) {
                    total*=1000000000000000L;
                    int end = k+15;
                    if (end>ssub.length()) {
                        end=ssub.length();
                    }
                    total+=Long.parseLong(ssub.substring(k,end));
                    total%=2019;
                }
                if (total==0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
