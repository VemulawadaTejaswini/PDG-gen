import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < h; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < w; j++) {
                if (i < b) {
                    if (j < a) {
                        sb.append('0');
                    } else {
                        sb.append('1');
                    }
                } else {
                    if (j < a) {
                        sb.append('1');
                    } else {
                        sb.append('0');
                    }
                }
            }
            System.out.println(sb);
        }
    }
}

