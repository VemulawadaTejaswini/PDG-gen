import java.util.*;

public class Main {

	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		}
	
	public static int r (int a){
		
		if (a == 1){
			return 1;
		}
		if (a == 2){
			return 3;
		}
		else{
			int x = a + (a-1);
			return x;
		}
	}
}
