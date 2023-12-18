import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(), num2 = scan.nextInt();

        int multi = num1 * num2;
        if(multi % 2 == 0){
            System.out.println(multi / 2);
        }else{
            System.out.println( (multi + 1) / 2);
        }
    }
}
