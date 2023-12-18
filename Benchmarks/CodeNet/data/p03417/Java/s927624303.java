import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        long num1 = cin.nextInt();
        long num2 = cin.nextInt();
        long count = (num1 == 1 && num2 == 1) ? 1
        	 	   : (num1 == 1 || num2 == 1) ? num1 * num2 - 2
        	 	   : (num1 - 2) * (num2 - 2);

        System.out.println(count);
    }
}