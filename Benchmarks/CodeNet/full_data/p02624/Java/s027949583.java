import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n = scn.nextInt();
		long sum=0;
		long []ans= new long[100001];
		
		for(int i=1;i<ans.length;i++){
			sum+=res(i)*i;
			ans[i]=sum;
		}
		if(n<10001){
			System.out.println(ans[n]);
			return ;
		}
		for(int i=10002;i<=n;i++){
			sum+=res(i)*i;
		}
         System.out.println(sum);
	}
	
	public static long res(int n){
		if(n==1){
			return 1;
		}
		
		long ans=2;
		
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				if(n/i!=i){
					ans+=2;
				}else{
					ans+=1;
				}
			}
		}
		return ans;
	}
	

}