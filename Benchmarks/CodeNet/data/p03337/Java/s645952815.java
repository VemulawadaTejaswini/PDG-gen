import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int largest = a + b;
        if (a - b > largest) {
            largest = a - b;
        } else if (a * b > largest) {
            largest = a * b;
        }
        System.out.println(largest);
    }
}