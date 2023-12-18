import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n%4 == 0) System.out.println("Yes");
        else if (n%7 == 0) System.out.println("Yes");
        else if (n%11 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}