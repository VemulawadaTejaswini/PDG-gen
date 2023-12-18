import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        int bigCoins = inputInt / 500;
        int nokori = inputInt % 500;
        int smallCoins = nokori / 5;
        System.out.println(bigCoins * 1000 + smallCoins * 5);
    }
}
