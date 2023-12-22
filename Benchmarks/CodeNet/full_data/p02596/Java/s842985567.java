import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("7");

        if ((k % 2) == 0) {
            System.out.println("-1");
        } else {
            while (true) {
                count++;
                long i = Long.parseLong(sb.toString());
                if ((i % k) == 0) {
                    break;
                }
                sb.append("7");
            }
            System.out.println(count);
        }
        sc.close();
    }

}
