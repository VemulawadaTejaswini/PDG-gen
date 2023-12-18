
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        if (A!=B &&A!=C&&C!=B){
            System.out.println("3");
            System.out.println("Three different colors: 1,3, and 4.");
        }
        else {
           System.out.println("2");
            System.out.println("Two different colors:3and33."); 
        }  
}
}