
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [][]a = new int [3][3];
		
		for(int i = 0 ;i < 3; i++) {
			for(int j = 0 ; j < 3 ;j++) {
				a[i][j] = Integer.parseInt(sc.next());
			}
		} 
		
		int n = Integer.parseInt(sc.next());
		
		int []b = new int [n];
		
		for(int i = 0 ; i< n ;i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		
		boolean [][]ans = new boolean [3][3];
		
		for(int i = 0 ;i < n ;i++) {
			for(int j = 0 ; j < 3 ;j++) {
				for(int k = 0 ; k < 3 ; k++) {
					if(b[i] == a[j][k]) {
						ans[j][k] = true;
					}
				}
			}
		}
		boolean flag = false;
		
		for(int i = 0 ; i < 3 ;i++) {
			if(ans[i][0]&&ans[i][1]&&ans[i][2]) {
				flag = true;
			}
			if(ans[0][i]&&ans[1][i]&&ans[2][i]) {
				flag = true;
			}
		}
		
		if(ans[0][0]&&ans[1][1]&&ans[2][2]) {
			flag = true;
		}
		if(ans[0][2]&&ans[1][1]&&ans[2][0]) {
			flag = true;
		}
		
		if(flag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
