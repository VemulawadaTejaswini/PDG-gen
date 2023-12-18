import java.util.*;

public class main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A <= C){
			if (C <= B){
				System.out.println("Yes");
			}
		}else{
			System.out.println("NO");
		}
		
 }
}
