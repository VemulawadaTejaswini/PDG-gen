import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int count_operate = 0;// 操作回数
        int count_a = 0;// 'A'の検出回数
        char last = 'X';// "ABC"以外で初期化
        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)) {
                case 'A':
                    count_a++;
                    last = 'A';
                    break;
                case 'B':
                    if (last != 'A') {
                        count_a = 0;
                    }
                    last = 'B';
                    break;
                default://'C'
                    if (last == 'B' && count_a != 0) {
                        count_operate += count_a;
                        // BCの前のAの数だけABC->BCA置換
                        last = 'A';
                    } else {
                        count_a = 0;
                        last = 'C';
                    }
                    break;
            }
        }
        System.out.println(count_operate);
    }
}
