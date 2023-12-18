import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int month1 = sc.nextInt();
        int date1 = sc.nextInt();
        int month2 = sc.nextInt();
        
        if (month1 != month2) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}