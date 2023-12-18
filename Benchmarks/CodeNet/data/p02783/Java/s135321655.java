import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.next());
        int a = Integer.parseInt(scanner.next());
        for (int i = 1; true; i++) {
            h = h - a;
            if (h <= 0){
                System.out.println(i);
                return;
            }
        }
    }
}
