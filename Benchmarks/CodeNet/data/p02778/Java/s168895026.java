import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            System.out.print("x");
        }
        System.out.println();
    }
}
