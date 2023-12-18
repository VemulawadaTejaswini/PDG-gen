import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long l = input.nextLong();
        long r = input.nextLong();
        System.out.println(((l % 2019) * ((l + 1) % 2019) % 2019));
    }
}
