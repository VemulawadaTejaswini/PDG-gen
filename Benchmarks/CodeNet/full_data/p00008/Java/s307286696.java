import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int n = Integer.parseInt(sc.next());

            int num = 0;
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j <= 9; j++) {
                    for (int k = 0; k <= 9; k++) {
                        for (int l = 0; l <=9; l++) {
                            if (i + j + k + l == n) num++;
                        }
                    }
                }
            }
            System.out.println(num);
        }
    }
}