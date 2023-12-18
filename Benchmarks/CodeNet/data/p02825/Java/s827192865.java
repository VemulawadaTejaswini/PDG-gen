import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            if (N % 3 != 0) {
                System.out.println(-1);
                return;
            }

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < N / 3; i++) {
                sb1.append("aa.");
                sb2.append("..b");
            }

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < N / 3; i++) {
                ans.append(sb1.toString()).append("\n");
                ans.append(sb2.toString()).append("\n");
                ans.append(sb2.toString()).append("\n");
            }

            System.out.print(ans.toString());
        }
    }

}
