 
import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N*100%108==0)System.out.println(N/1.08);
		else if((N+1)*100%108==0) System.out.println(":(");
		else System.out.println((int)((N+1)/1.08));
	}
	
}