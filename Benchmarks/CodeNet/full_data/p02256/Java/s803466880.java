import java.util.*;
import java.lang.*;

public class Main {
	
	public static int gcf(int n1, int n2) {
	
		if(n2==0) {
			return n1;
		}else {
			return gcf(n2, n1%n2);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(gcf(scan.nextInt(),scan.nextInt()));
		
	}
}
