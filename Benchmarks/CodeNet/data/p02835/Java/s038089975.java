import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >= 1 && a <= 13 && b >= 1 && b <= 13 && c >= 1 && c <= 13){
     		 if(a + b + c <= 21){
        		System.out.println("Win");
     	   }else{
        		System.out.println("bust");
        	}
        }
    }
}