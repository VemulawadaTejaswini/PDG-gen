import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        
       if(number1 == number2){
        System.out.println(number1*2);
       } else {
         int x = max(number1,number2);
        System.out.println(x*2-1);
       }
    }
   public static int max(int n, int m){
   		if(n > m){
        	return n;
        } else {
        	return m;
        }
   }
}