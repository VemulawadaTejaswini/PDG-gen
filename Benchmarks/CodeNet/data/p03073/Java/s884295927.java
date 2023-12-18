import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Integer dec = Integer.parseInt(s, 2);
        
        if (s.length() < 3) {
            System.out.println(0);
            System.exit(0);
        }

        Integer count = 0;
        for (int i = 0; i <= dec; i++) {
            if((dec | (1 << 1)) != 0) {
                dec /= 4;
                count++;
            }
        }

        System.out.println(count);
    }
}
