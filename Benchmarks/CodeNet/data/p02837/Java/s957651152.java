import java.util.Scanner;
public class Main{
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int A[][]=new int[N+1][N+1];//1:true 2:false
	int ans=N;
	int checked[]=new int[N+1];
	for(int i=1;i<=N;i++) {
		int prrofnum=sc.nextInt();
		for(int j=0;j<prrofnum;j++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(y==0) {
				A[i][x]=2;
			}else {
				A[i][x]=1;
			}
		}
	}
	for(int i=1;i<=N;i++) {
		for(int j=1;j<=N;j++) {
			if(A[i][j]==1&&A[j][i]==2) {
				if(checked[i]!=1) {
				ans--;
				}
				checked[i]=1;
				checked[j]=1;
				A[j][i]=0;
			}
			}
		}

	for(int i=1;i<=N;i++) {
		for(int j=1;j<=N;j++) {
			if(A[i][j]==2&&A[j][i]==2) {
				if(checked[j]==0) {
				ans--;
				}
				checked[i]=1;
				checked[j]=1;
				A[j][i]=0;
			}
			}
		}
	System.out.println(ans);

}
}