import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        int ans = 0;
        for (int i=0;i<=(s.length()-4);i++) {
                int total=0;
                for (int k=i;k<s.length();k++) {
                    total*=10;
                    total+=Character.getNumericValue(c[k]);
                    total%=2019;
                    if (total==0) {
                        ans++;
                    }
                }
        }
        System.out.println(ans);
    }
}
