import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int lapLength = (h + w) * 2;
        int square = h * w;
        System.out.println(square + " " + lapLength);
    }
}
