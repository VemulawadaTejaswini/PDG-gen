import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 入力受付
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        char array[] = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (array[i] != '0') {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        array[j] = '0';
                    } else {
                        break;
                    }
                }
            }

        }

        String result = String.valueOf(array);
        result = result.replaceAll("0", "");

        System.out.println(result.length());

    }

}