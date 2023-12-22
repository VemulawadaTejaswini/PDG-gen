// 提出時に消す


import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        String str = Long.toString(n, 26);

        StringBuilder sb = new StringBuilder(str);

        StringBuilder rev = sb.reverse();

        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) == '0') {
                for (int j = i + 1; j < rev.length(); j++) {
                    if (rev.charAt(j) == '1') {
                        rev.setCharAt(j, 'q');
                    } else {
                        break;
                    }
                }
            }
        }

        String ans = "";
        for (int i = 0; i < sb.length(); i++) {
            ans += replace(sb.charAt(i));
        }
        System.out.println(ans);

        sc.close();
    }

    public static String replace(char c) {
        switch (c) {
            case '1':
                return "a";
            case '2':
                return "b";
            case '3':
                return "c";
            case '4':
                return "d";
            case '5':
                return "e";
            case '6':
                return "f";
            case '7':
                return "g";
            case '8':
                return "h";
            case '9':
                return "i";
            case 'a':
                return "j";
            case 'b':
                return "k";
            case 'c':
                return "l";
            case 'd':
                return "m";
            case 'e':
                return "n";
            case 'f':
                return "o";
            case 'g':
                return "p";
            case 'h':
                return "q";
            case 'i':
                return "r";
            case 'j':
                return "s";
            case 'k':
                return "t";
            case 'l':
                return "u";
            case 'm':
                return "v";
            case 'n':
                return "w";
            case 'o':
                return "x";
            case 'p':
                return "y";
            case 'q':
                return "z";
            default:
                return "";
        }
    }
}