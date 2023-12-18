import java.util.Scanner;
 
class aaa{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a * b;
      
        
        if(c / 2 == 0){
        	System.out.print("Even");
        }else {
        	System.out.print("Odd");
        }
    }
}