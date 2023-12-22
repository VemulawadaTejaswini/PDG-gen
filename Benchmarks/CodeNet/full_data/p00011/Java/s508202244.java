import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		int[] ans = new int[w];
		
		// format yoko
		for(int i = 0; i<n; i++){
			String[] s = sc.next().split(",");
			a[i][0] = Integer.parseInt(s[0]);
			a[i][1] = Integer.parseInt(s[1]);
		}
		
		for(int j = 1; j<=w; j++){
			int t = j;
			for(int k = 0; k<n; k++){
				if(a[k][0] == t){
					t = a[k][1];
				}else if(a[k][1] == t){
					t = a[k][0];
				}
			}
			ans[t-1] = j;
		}
		
		for(int i = 0; i<w; i++){
			System.out.println(ans[i]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}