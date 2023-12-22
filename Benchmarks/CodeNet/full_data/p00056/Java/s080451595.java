import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int[] prime=new int[50001];
		boolean[] primeflag=new boolean[50001];
		Scanner sc=new Scanner(System.in);
		prime[0]=2;
		primeflag[2]=true;
		prime[1]=3;
		primeflag[3]=true;
		int ptr=2;
		for(int i=5;i<=50000;i++){
			boolean flag=true;
			for(int j=0;prime[j]<=Math.sqrt(i);j++){
				if(i%prime[j]==0){
					flag=false;
				}
			}
			if(flag){
				prime[ptr++]=i;
				primeflag[i]=true;
			}
		}
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int count=0;
			for(int i=0;prime[i]<=n/2;i++){
				if(primeflag[(n-prime[i])]){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}