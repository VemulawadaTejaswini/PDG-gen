import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        sc.nextLine();
        final String s = sc.nextLine();
        final int combinations = (int) Math.pow(2, 26) - 1;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            count[c - 97]++;
        }
        String b = "";
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                b += "1";
            } else {
                b += "0";
            }
        }
        final int target = Integer.parseInt(b, 2);
        int result = 0;
        for (int i = 1; i <= combinations; i++) {
            if ((target & i) == i) {
                //has combination
                String s1 = Integer.toBinaryString(i);
                while (s1.length() < 26) {
                    s1 = "0" + s1;
                }
                final char[] chars = s1.toCharArray();
                int r = 1;
                for (int i1 = 0; i1 < chars.length; i1++) {
                    if (chars[i1] == '1') {
                        r = (r * count[i1]) % 1_000_000_007;
                    }
                }
                result += r;
                result %= 1_000_000_007;
            }
        }
        System.out.println(result);
    }

}
