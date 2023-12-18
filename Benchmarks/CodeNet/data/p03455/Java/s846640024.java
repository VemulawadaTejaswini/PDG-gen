import java.util.Scanner;

class main {
    public static void main(String[] args) {
      	Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num = num1 * num2;
      	if (num % 2 == 0){
        	System.out.println("Even");
        }else if (num % 2 == 1){
        	System.out.println("Odd");
        }
    }
}