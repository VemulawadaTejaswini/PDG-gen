import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String[] res = new String[100005];
        for (int i = 1; i <= 9; i++) {
            res[i] = i + "";
        }
        int size = 9;
        for(int start = 1; ; ++start) {
            String s = res[start];
            char c = s.charAt(s.length() - 1);
            if (c == '0') {
                res[++size] = s + '0';
                res[++size] = s + '1';
            } else if (c < '9') {
                res[++size] = s + (c - 1);
                res[++size] = s + c;
                res[++size] = s + (c + 1);
            } else {
                res[++size] = s + '8';
                res[++size] = s + '9';
            }
            if (size >= k) break;
        }
        System.out.println(res[k]);
    }
}
