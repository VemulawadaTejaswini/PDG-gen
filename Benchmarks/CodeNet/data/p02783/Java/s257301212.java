import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        int h = Integer.parseInt( params[0]);
        int a = Integer.parseInt( params[1]);

        System.out.println( h / a + ( h % a == 0  ? 0 : 1 ) );

    }

}
