import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String coffee;
        Scanner scan = new Scanner(System.in);
        
        coffee = scan.nextLine();
        
        if(coffee.charAt(2) == coffee.charAt(3) ||
           coffee.charAt(4) == coffee.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}