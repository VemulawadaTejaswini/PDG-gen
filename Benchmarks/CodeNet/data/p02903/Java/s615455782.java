import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		int a = sc.nextInt(), b = sc.nextInt();
		int ans[][] = new int[h][w];
		sc.close();
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(i<b) {
					if(j<a)ans[i][j]=1;
				}
				else {
					if(j>=a)ans[i][j]=1;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				sb.append(ans[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
