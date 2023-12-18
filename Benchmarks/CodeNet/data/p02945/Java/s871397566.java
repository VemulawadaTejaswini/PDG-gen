import java.util.*;	
public class Main {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int wa=A+B;
		int sa=A-B;
		int seki=A*B;
		int max=Math.max(wa,sa);
		max=Math.max(max, seki);
		System.out.println(max);		
		sc.close();
		
	  }	          	
}