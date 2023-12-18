import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine()
                .replaceAll("BC", "X");
        int len = s.length();
        int count_operate = 0;// 操作回数
        int count_a = 0;// 'A'の検出回数
        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)) {
                case 'A':
                    count_a++;
                    break;
                case 'X':
                    // Xの前のAの数だけAX->XA置換
                    count_operate += count_a;
                    break;
                default:
                    count_a = 0;
            }
        }
        System.out.println(count_operate);
    }
}