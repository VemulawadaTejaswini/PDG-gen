import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int n;
	int[][] path;
	void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		path=new int[n+1][n+1];
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			path[a][b]++;
			path[b][a]++;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(path[i][j]%2!=0){
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
}
