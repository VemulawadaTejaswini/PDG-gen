import java.util.*;

public class Main {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
      	int k = scan.nextInt();
      
      if(n*500 >= k)
        System.out.println("YES");
      else
        System.out.println("NO");
		
	}
	
}
