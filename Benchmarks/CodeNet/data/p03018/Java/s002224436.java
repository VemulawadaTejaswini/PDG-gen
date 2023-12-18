import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine()
                .replaceAll("BC", "X");
        int len = s.length();
        int count_operate = 0;// 操作回数
        int count_a = 0;// 'A'の検出回数
        char last = 'Z';// "AX"以外で初期化
        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)) {
                case 'A':
                    count_a++;
                    last = 'A';
                    break;
                case 'X':
                    if (last == 'A' && count_a != 0) {
                        count_operate += count_a;
                        // BCの前のAの数だけAX->XA置換
                        last = 'A';
                    } else {
                        count_a = 0;
                        last = 'X';
                    }
                    break;
                default:
                    count_a = 0;
                    last = 'Z';
            }
        }
        System.out.println(count_operate);
    }
}