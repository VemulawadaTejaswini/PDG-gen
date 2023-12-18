import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (3200 > Integer.valueOf(in.next()))
            System.out.println("red");
        else
            System.out.println(in.next());
    }
}
