import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num1 = scan.nextLong(), num2 = scan.nextLong();

        long multi = num1 * num2;

        
        if(multi % 2 == 0){
            System.out.println(multi / 2);
        }else{
            System.out.println( (multi + 1) / 2);
        }
    }
}