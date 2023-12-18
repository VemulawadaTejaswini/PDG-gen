import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //        int n = sc.nextInt();

        String[] in = new String[3];

        for (int i = 0; i < 3; i++) {
            in[i] = sc.next();
        }

        sc.close();

        System.out.println(in[0].substring(0, 1) + in[1].substring(1, 2) + in[2].substring(2));
    }
}