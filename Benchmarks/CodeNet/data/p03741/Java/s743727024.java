import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		long cnt1 = 0;
		long cnt2 = 0;
		for (int i=0;i<n;i++){
			int x = sc.nextInt();
			sum1+=x;
			sum2+=x;
			if (i%2==0) {
				if(sum1>=0){
					cnt1+=sum1+1;
					sum1=-1;
				}
				if (sum2<=0) {
					cnt2+=-sum2+1;
					sum2=1;
				}
			}else{
				if(sum1<=0){
					cnt1+=-sum1+1;
					sum1=1;
				}
				if (sum2>=0){
					cnt2+=sum2+1;
					sum2=-1;
				}
			}
		}
		System.out.println(Math.min(cnt1, cnt2));
	}
}
