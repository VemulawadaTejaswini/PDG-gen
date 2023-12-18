import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num1 = scan.nextLong(), num2 = scan.nextLong(), num3 = scan.nextLong();
        // long num1 = 2, num2=3, num3 = 10;
        long multi = num1 * num2;
        double right = (double)(num3 - num1 - num2);

        System.out.println(multi);
        System.out.println(right * right / 4);
        if( multi < ((right * right) / 4)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scan.close();
    }
}