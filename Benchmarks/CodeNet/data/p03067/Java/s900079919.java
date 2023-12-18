import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grid1 = sc.nextInt();
		int grid2 = sc.nextInt();
		int grid3 = sc.nextInt();
		String result ;
		if( grid1 < grid2 ) {
			result = grid1 < grid3 && grid3 < grid2 ? "Yes" : "No";
		} else {
			result = grid2 < grid3 && grid3 < grid1 ? "Yes" : "No";
			
		}
		System.out.println(result);
	    
		sc.close();
	}
}
