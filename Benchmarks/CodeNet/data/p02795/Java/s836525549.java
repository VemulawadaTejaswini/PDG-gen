import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = Math.max(sc.nextInt(),sc.nextInt());
        System.out.println((int)(Math.ceil(sc.nextInt()/max)));
    }
}