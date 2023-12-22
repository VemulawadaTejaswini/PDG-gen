import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer str = new StringBuffer(s);
        String r = str.reverse().toString();
        char[] c = r.toCharArray();
        int size = r.length();
        int ans = 0;
        int[] count = new int[2019];
        int total = 0;
        int mod = 2019;
        int exp = 1;
        for (int i = 0; i < size; i++) {
            count[total]++;
            total += Integer.parseInt(String.valueOf(c[i])) * exp;
            total %= mod;
            ans += count[total];
            exp *= 10;
            exp %= mod;
        }
        System.out.println(ans);
    }
}
