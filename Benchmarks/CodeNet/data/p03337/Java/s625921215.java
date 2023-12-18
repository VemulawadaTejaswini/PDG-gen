import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int largest = 0;
        int sum = a + b;
        int min = a - b;
        int mult = a * b;
        
        largest = sum > largest ? sum : largest;
        largest = min > largest ? min : largest;
        largest = mult > largest ? mult : largest;
        
        System.out.println(largest);
    }
}