import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int M = scan.nextInt();
        int K = scan.nextInt();
        int max = (int) Math.pow(2, M);
        if (K == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < max; i++) {
                sb.append(i);
                sb.append(" ");
                sb.append(i);
                sb.append(" ");
            }
            String temp = sb.toString();
            System.out.println(temp.substring(0, temp.length() - 1));
        } else {
            System.out.println("-1");
        }
    }
}
