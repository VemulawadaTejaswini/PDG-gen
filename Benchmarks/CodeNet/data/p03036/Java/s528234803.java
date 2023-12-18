import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r = Integer.valueOf(input[0]);
        int d = Integer.valueOf(input[1]);
        int x = Integer.valueOf(input[2]);
        for(int i = 1; i < 11; i++) {
            int result = (r * x) - d;
            x = result;
            System.out.println(result);
        }
    }
}