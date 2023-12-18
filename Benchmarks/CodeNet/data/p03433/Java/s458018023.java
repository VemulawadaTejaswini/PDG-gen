import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int gohyaku_mai = num1 / 500;
        int ichi_mai = num1 - 500 * gohyaku_mai;
      
        if(ichi_mai <= num2) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}