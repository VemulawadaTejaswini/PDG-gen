import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Main{
	public static void main(String[] args){
		while(true){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0){break;}
		int[] sum = new int[10000];
		int small=0;
		int max=0;
		int wa= 0;

		for(int i=0;i<=n-1;i++){
			
			int k = sc.nextInt();
			sum[i] = k;
			wa = wa + sum[i];
			if(i == 1){
				if(sum[0]>=sum[1]){
					max = sum[0];
					small = sum[1];
				}
				else{
					max = sum[1];
					small = sum[0];
				}
			}
			
			if(i>=2){
				if(max<=sum[i]){
					max = sum[i];
				}
				if(small>=sum[i]){
					small = sum[i];
				}
			}


		}
		int ave;
		ave = (wa-small-max)/(n-2);
		System.out.println(ave);
	}


		}
}