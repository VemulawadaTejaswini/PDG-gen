import java.util.Scanner;

public class Main {

	static int[] a = {500,100,50,10,5,1};
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			int N = cin.nextInt();
			if(N==0)break;
			N=1000-N;
			int ans=0;
			int i = 0;
			while(N!=0){
				if(a[i]<=N){
					N-=a[i];
					ans++;
				}
				else{
					i++;
				}
			}
			System.out.println(ans);
		}
	}

}