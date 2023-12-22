import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int N = s.nextInt();

        while (N-- > 0) {
            String mcxi1 = s.next();
            String mcxi2 = s.next();

            int num1 = changeToNum(mcxi1);
            int num2 = changeToNum(mcxi2);

            int ans = num1 + num2;

            System.out.println(changeToMCXI(ans));
        }
    }

    static int changeToNum(String str) {
        char[] ch = str.toCharArray();
        int num = 0;
        int temp = 1;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                temp = (int) ch[i] - 48;
            } else {
                switch (ch[i]) {
                    case 'm':
                        num += temp * 1000;
                        break;
                    case 'c':
                        num += temp * 100;
                        break;
                    case 'x':
                        num += temp * 10;
                        break;
                    case 'i':
                        num += temp;
                        break;
                }
                temp = 1;
            }
        }
        return num;
    }

    static String changeToMCXI(int num) {
        char[] ch = new char[9];
        int i = 0;
        if (num / 1000 != 0) {
            if (num / 1000 != 1)
                ch[i++] = (char) (48 + num / 1000);
            ch[i++] = 'm';
            num = num % 1000;
        }
        if (num / 100 != 0) {
            if (num / 100 != 1)
                ch[i++] = (char) (48 + num / 100);
            ch[i++] = 'c';
            num = num % 100;
        }
        if (num / 10 != 0) {
            if (num / 10 != 1)
                ch[i++] = (char) (48 + num / 10);
            ch[i++] = 'x';
            num = num % 10;
        }
        if (num / 1 != 0) {
            if (num != 1)
                ch[i++] = (char) (48 + num);
            ch[i++] = 'i';
        }
        return String.valueOf(ch);
    }
}