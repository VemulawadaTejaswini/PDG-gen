import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        for (int i = 1; i <= m; i++) {
            System.out.println(i + " " + (n - i + 1));
        }
    }

}
