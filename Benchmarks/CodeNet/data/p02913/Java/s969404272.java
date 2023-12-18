import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		String S=sc.next();
		int len[][]=new int[N+1][N+1];
		//System.out.println(len[0][0]);
		int ans=0;
		for(int i=N-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(S.charAt(i)==S.charAt(j)) {
					len[i][j]=len[i+1][j+1]+1;
				}
				ans=Math.max(ans, Math.min(len[i][j],i-j ));
			}
		}
		/*for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(len[i][j]+",");
			}
			System.out.println();
		}*/
		System.out.println(ans);

	}
}
