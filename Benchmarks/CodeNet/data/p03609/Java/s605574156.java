import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int t = sc.nextInt();
		
		sc.close();
		
		if(x-t>0) {
			System.out.println(x-t);
		}else {
			System.out.println(0);
		}

	}

}
