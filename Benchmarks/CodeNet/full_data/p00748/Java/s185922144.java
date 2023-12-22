import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] dp1=new int[1000000];
	static int[] dp2=new int[1000000];
	
	static void n() {
		for(int num=1; num*(num+1)*(num+2)/6<1000000; num++) {
			dp1[num*(num+1)*(num+2)/6]=1;
			if((num*(num+1)*(num+2)/6)%2!=0){
				dp2[num*(num+1)*(num+2)/6]=1;
			}
		}
	}
	
	static void dp() {
		for(int num=1; num<=1000000; num++) {
			for(int i=1; i<num; i++) {
				dp1[num]=Math.min(dp1[num], dp1[num-i]+dp1[i]);
				//System.out.println("i="+i+"dp1["+num+"]="+dp1[num]);
				dp2[num]=Math.min(dp2[num], dp2[num-i]+dp2[i]);
				//System.out.println("i="+i+"dp2["+num+"]="+dp2[num]);
			}
		}
	}
	
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			Arrays.fill(dp1, 100000000);
			Arrays.fill(dp2, 100000000);
			n();
			dp();
			while(sc.hasNext()) {
				int N=sc.nextInt();
				if(N==0) break;
				
//				for(int num=1; num<=N; num++) {
//					for(int i=1; i<num; i++) {
//						dp1[num]=Math.min(dp1[num], dp1[num-i]+dp1[i]);
//						//System.out.println("i="+i+"dp1["+num+"]="+dp1[num]);
//						dp2[num]=Math.min(dp2[num], dp2[num-i]+dp2[i]);
//						//System.out.println("i="+i+"dp2["+num+"]="+dp2[num]);
//					}
//				}
				System.out.println(dp1[N]+" "+dp2[N]);
				
			}
		}
	}
} 
