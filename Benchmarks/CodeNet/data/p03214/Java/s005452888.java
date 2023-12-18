import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int ar[] = new int[N];
		float sum = 0;
		for(int n=0;n<N;n++){
			ar[n] = sc.nextInt();
			sum += ar[n];
		}
		float ave = sum/N;
		int ans=0;
		float dif = 99999;
		for(int n=0;n<N;n++){

			float d = Math.abs(ave-ar[n]);
			
			if(d<dif){
				ans = n;
				dif = d;
			}
		}
		System.out.println(ans);
	}
}