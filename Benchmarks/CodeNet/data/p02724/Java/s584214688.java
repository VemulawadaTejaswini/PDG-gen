import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long x = stdIn.nextLong();

        long fromX = x / 500;

        long fromY = (x - fromX * 500) / 5;

        System.out.println(fromX * 1000 + fromY * 5);
    }
}