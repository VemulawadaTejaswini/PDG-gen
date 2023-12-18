import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		Long A[]=new Long[N+1];
		A[0]=0L;
		long co=0;
		for(int i=1;i<N+1;i++) {
			co+=scan.nextInt();
			A[i]=co;
		}
		int ans=0;
		Arrays.sort(A);
		int count=0;
		for(int i=1;i<N+1;i++) {
			if(A[i]!=A[i-1]) {
				ans+=(count+1)*count/2;
				count=0;
			}
			else {
				count++;
			}
		}
		ans+=(count+1)*count/2;
		System.out.println(ans);
	}
}
