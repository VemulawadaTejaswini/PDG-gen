import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int bonus = num/15;
        int paid = num * 800;
        System.out.println(paid-(bonus*200));
    }
}
