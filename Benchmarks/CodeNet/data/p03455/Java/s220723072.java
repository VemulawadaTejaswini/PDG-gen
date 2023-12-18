import java.util.Scanner;
public class Main {
    public static void main(String args[]){
   	    Scanner scan = new Scanner(System.in);
        int a = new scan.next();
        int b = new scan.next();
        if (a%2==0){
        	if (b%2==0){
        		System.out.println("Even");
        	} else {
        		System.out.println("Odd");
        	}
        } else {
        	System.out.println("Odd");
        }
    }
}