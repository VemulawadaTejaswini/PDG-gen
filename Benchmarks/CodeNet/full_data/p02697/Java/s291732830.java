import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        System.out.println(1 + " " + n);
        for (int i = 2, j = 2; i <= m; i++, j++) {
            System.out.println(i + " " + i * 2);
        }
    }

}
