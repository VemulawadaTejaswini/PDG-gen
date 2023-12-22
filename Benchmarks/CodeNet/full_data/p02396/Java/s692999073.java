import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nums = 1;
		int num = 1;
		for(int i = 0; nums != 0 ; ++i,num++) {
			nums = scan.nextInt();
			if(nums == 0) break;
			System.out.println("Case " + num + ": " + nums);
		}

 }
}