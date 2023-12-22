import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N = cin.nextInt();
			if(N==0){
				break;
			}
			int[] a = new int[N+1];
			int[] sum = new int[N+1];
			int max = -999999;
			for(int i = 1; i <= N;i++){
				a[i]=cin.nextInt();
				sum[i]=sum[i-1]+a[i];
			}
			for(int i = 0; i <= N;i++){
				for(int j = i+1; j <= N;j++){
					max = Math.max(max,sum[j]-sum[i]); 
				}
			}
			System.out.println(max);
		}
	}

}