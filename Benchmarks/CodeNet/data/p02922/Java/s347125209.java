import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] AB = sc.nextLine().split(" ");
        int A = Integer.parseInt(AB[0]);
        int B = Integer.parseInt(AB[1]);

        if (B % A == 0) {
            System.out.println(B / A);
        } else {
            System.out.println(B / A + 1);
        }
    }

}
