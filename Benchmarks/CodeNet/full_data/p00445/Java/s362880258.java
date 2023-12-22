import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] in = sc.next().toCharArray();
            System.out.println(joi(in));
            System.out.println(ioi(in));
        }
    }

    public static int joi(char[] in) {
        int ans = 0;
        char buf = '0';
        for (int i = 0; i < in.length; i++) {
            switch (in[i]) {
            case 'J':
                buf = in[i];
                break;
            case 'O':
                if (buf == 'J') {
                    buf = 'O';
                } else
                    buf = '0';
                break;
            case 'I':
                if (buf == 'O') {
                    buf = '0';
                    ans++;
                } else
                    buf = '0';
                break;
            default:
                buf = '0';
            }
        }
        return ans;
    }

    public static int ioi(char[] in) {
        int ans = 0;
        char buf = '0';
        for (int i = 0; i < in.length; i++) {
            switch (in[i]) {
            case 'I':
                if (buf == 'O') {
                    buf = 'I';
                    ans++;
                }
                buf = in[i];
                break;
            case 'O':
                if (buf == 'I') {
                    buf = 'O';
                } else
                    buf = '0';
                break;
            default:
                buf = '0';
            }
        }
        return ans;
    }
}