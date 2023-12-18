import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[][] a = new int[n][2];

		for(int i=0; i<n; i++){
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt(); 
		}

		int min=1001;

		for(int i=0; i<n; i++){
			if(a[i][1] <= t){
				if(a[i][0] < min){
					min = a[i][0];
				}
			}
		}

		if(min == 1001){
			System.out.println("TLE");
		}else{
			System.out.println(min);
		}
		

	}
}