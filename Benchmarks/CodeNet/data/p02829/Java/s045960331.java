import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int question = 1 + 2 + 3;
        System.out.println(String.format("%s", question - a - b));
        sc.close();
    }
}
