import java.util.*;
 
public class A{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		System.out.println((sc.nextInt() <= sc.nextInt())?"unsafe":"safe");
		
		sc.close();
    }
}