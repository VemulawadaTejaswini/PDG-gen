import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int x = in.nextInt();
        if(k * 500 >= x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
