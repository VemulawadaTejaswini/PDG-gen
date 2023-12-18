import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int takahashiHP = scanner.nextInt();
        int takahashiAttack = scanner.nextInt();

        int aokiHP = scanner.nextInt();
        int aokiAttack = scanner.nextInt();
        
        while(true) {
            aokiHP -= takahashiAttack;
            if(aokiHP <= 0) {
                System.out.println("Yes");
                break;
            }
            takahashiHP -= aokiAttack;
            if(takahashiHP <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}