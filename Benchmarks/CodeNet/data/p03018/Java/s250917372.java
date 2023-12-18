import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        long count_operate = 0L;// 操作回数
        long count_a = 0L;// 'A'の検出回数
        char last = 'X';// "ABC"以外で初期化
        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)) {
                case 'A':
                    count_a++;
                    last = 'A';
                    break;
                case 'B':
                    if (last != 'A') {
                        count_a = 0L;
                    }
                    last = 'B';
                    break;
                default://'C'
                    if (last == 'B' && count_a != 0L) {
                        count_operate += count_a;
                        // BCの前のAの数だけABC->BCA置換
                        last = 'A';
                    } else {
                        count_a = 0L;
                        last = 'C';
                    }
                    break;
            }
        }
        System.out.println(count_operate);
    }
}