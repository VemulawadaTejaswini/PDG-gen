
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n=scn.nextLong();
		long x=scn.nextLong();
		long tot_p=3,tot_b=2;
		for(int i=1;i<n;i++) {
			tot_p=tot_p*2+1;
			tot_b=tot_b*2+2;
		}
		long left=1;
		long right=tot_b+tot_p;
		long count=0,prev=tot_p;
		while(left<=right) {
			long mid=(left+right)/2;
			//System.out.println(left+" "+right+" "+mid+" "+prev+" "+count);

			if(x<mid) {
				right=mid-1;
				prev/=2;
				
			}else if(x>mid) {
				left=mid+1;
				long temp=prev;
				prev=prev/2+1;
				count+=prev;
				prev=temp-prev;
			}else {
				prev=prev/2+1;
				count+=prev;
				break;
			}
		}
		System.out.println(count);
	}

}
