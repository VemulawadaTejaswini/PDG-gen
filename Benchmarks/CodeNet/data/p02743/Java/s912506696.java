import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = (float) Math.sqrt(sc.nextFloat());
        float b = (float) Math.sqrt(sc.nextFloat());
        float c = (float) Math.sqrt(sc.nextFloat());
        if (a + b < c) System.out.println("Yes");
        else System.out.println("No");
    }
}