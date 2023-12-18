import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] a = new int[3][3];
		boolean[][] b = new boolean[3][3];

		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				a[i][j] = Integer.parseInt(sc.next());
				b[i][j] = false;
			}			
		}


		int n = Integer.parseInt(sc.next());

		for(int k = 0 ; k < n ; k++) {
			int tmp = Integer.parseInt(sc.next());
			for(int i = 0 ; i < 3 ; i++) {
				for(int j = 0 ; j < 3 ; j++) {
					
				if(a[i][j] == tmp) {
					b[i][j] = true;
				}	
					
					
				}			
			}
		}

		
		String ans = "No";
		for(int i = 0 ; i < 3 ; i++) {
			if(b[i][0] && b[i][1] && b[i][2]){
				ans = "yes";
				break;
			}
			
			if(b[0][i] && b[1][i] && b[2][i]){
				ans = "yes";
				break;
			}
		}
		
		if(b[0][0] && b[1][1] && b[2][2]) {
			ans = "yes";
		}
		
		if(b[2][0] && b[1][1] && b[2][0]) {
			ans = "yes";
		}
	
		System.out.println(ans);
		
		
	}
}