import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[][] r = new int[N*(N-1)/2][4];
		int[] cnt = {0,0,0,0};
		int[] rnk = new int[N];
		for(int i=0; i<r.length; i++){
			for(int j=0; j<4; j++){
				int a=sc.nextInt();
				r[i][j]=a;
			}
		}
		for(int i=0; i<r.length; i++){
			for(int j=2; j<3; j++){
				if(r[i][j]>r[i][j+1]){
					cnt[r[i][0]-1]+=3;
				}else if(r[i][j]<r[i][j+1]){
					cnt[r[i][1]-1]+=3;
				}else{
					cnt[r[i][0]-1]+=1;
					cnt[r[i][1]-1]+=1;
				}
			}
		}
		int result=1;
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				if(cnt[i]>cnt[j]){
					result++;
				}
			}
			rnk[i]=result;
			result=1;
		}
		for(int i=0; i<N; i++){
			System.out.println(rnk[i]);
		}
		// TODO Auto-generated method stub

	}

}