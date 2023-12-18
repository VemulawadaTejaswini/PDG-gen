import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        String s = in.nextLine();

        System.out.println( a >= 3200 ? s : "red");

    }

}