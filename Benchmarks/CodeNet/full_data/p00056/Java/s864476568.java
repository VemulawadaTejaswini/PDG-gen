import java.util.Scanner;
public class Main {
	static int[] prime=new int[50000];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ptr=0;
		prime[ptr++]=2;
		prime[ptr++]=3;
		for(int n=5;n<=50000;n+=2){
			int i;
			double sqrtn=Math.sqrt(n);
			for(i=1;i<ptr;i++){
				if(n%prime[i]==0||prime[i]>sqrtn){
					break;
				}
			}
			if(prime[i]>sqrtn){
				prime[ptr++]=n;
			}
		}
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int count=0;
			int i=0;
			while(prime[i]<n/2){
				if(prime(n-prime[i])){
					count++;
				}
				i++;
			}
			System.out.println(count);
		}
	}
	static boolean prime(int n){
		int i;
		for(i=1;prime[i]<=Math.sqrt(n);i++){
			if(n%prime[i]==0){
				return false;
			}
		}
		return true;
	}
}