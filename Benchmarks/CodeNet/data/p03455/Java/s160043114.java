import java.util.Scanner;
 
class aaa{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String c = a * b;
        
        if(c / 2 == 0){
        	System.out.print("Even");
        }else {
        	System.out.print("Odd");
        }
    }