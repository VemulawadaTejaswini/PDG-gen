import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int[] num=new int[a];
		for(int i=0;i<a;++i){
			num[i]=sc.nextInt();
		}
		int[] dp=new int[a];
		dp[0]=num[0];
		int length=1;
		for(int i=1;i<a;++i){
			if(dp[length-1]<num[i]){
				dp[length++]=num[i];
			} else {
				int c = Arrays.binarySearch(dp,num[i]);
				if(c<0){
				} else {
					dp[Arrays.binarySearch(dp,num[i])]=num[i];
				}
			}
		}
		System.out.println(length);
	}
}