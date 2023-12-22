import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++){
			String si = String.valueOf(i);
			if(i % 3 == 0){
				System.out.printf(" %s", si);
			} else if(si.contains("3")){
				System.out.printf(" %s", si);
			}
		}
		System.out.printf("\n");
	}
}