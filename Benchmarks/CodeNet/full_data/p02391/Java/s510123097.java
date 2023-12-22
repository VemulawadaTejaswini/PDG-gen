import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String s = "";

        if (x > y) {
            s = ">";
        }
        else if (x < y) {
            s = "<";
        }
        else {
            s = "==";
        }
        System.out.print("a");
        System.out.print(" ");
        System.out.print(s);
        System.out.print(" ");
        System.out.println("b");
    }
}
