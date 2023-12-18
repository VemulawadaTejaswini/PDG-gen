import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num1 = scan.nextLong(), num2 = scan.nextLong(), num3 = scan.nextLong();

        double sqrt_multi = Math.sqrt(num1 * num2);

        if(sqrt_multi < (num3 - num1 - num2) / 2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scan.close();
    }
}