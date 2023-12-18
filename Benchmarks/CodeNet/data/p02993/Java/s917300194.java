import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 1000;
        int b = -(a * 10 - n / 100);
        int c =  n / 10-a * 100 - b * 10;
        int d = n % 10;

        if (a == b || b == c || c == d) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}

