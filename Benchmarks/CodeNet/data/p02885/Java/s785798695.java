import java.util.Scanner;

public class ABC086_A_Product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if((a - 2*b) > 0){
        	System.out.println(a - 2b);
        }else{
        	System.out.println(0);
        }
	}        
}