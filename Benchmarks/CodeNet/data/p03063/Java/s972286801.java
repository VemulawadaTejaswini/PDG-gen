import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        String[] str = S.split("");

        int count = 0;

        int leftBlack = 0;
        int leftWhite = 0;
        int rigthBlack = 0;
        int rightWhite = 0;

        // 全量
        for (int i = 0; i < N; i++) {
            if (".".equals(str[i])) {
                rightWhite++;
            } else {
                rigthBlack++;
            }
        }

        count = rightWhite;

        // チェック
        for (int i = 0; i < N; i++) {
            if(".".equals(str[i])){
                leftWhite++;
                rightWhite--;
            }else{
                leftBlack++;
                rigthBlack++;
            }
            int calc = leftBlack + rightWhite;
            count = Math.min(count,calc);
        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }
}
