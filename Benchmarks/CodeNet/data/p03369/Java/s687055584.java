import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] order = s.split("");
        int sum = 700;
        for (int i = 0; i < order.length; i++) {
            if ("o".equals(order[i])) {
                sum += 100;
            }
        }
        System.out.println(sum);
    }

}
