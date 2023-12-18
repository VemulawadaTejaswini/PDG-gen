import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();
        long multi = (long)(num1 * num2);
        double right = (double)(num3 - num1 - num2);

        if( multi < ((right * right) / 4)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        scan.close();
    }
}