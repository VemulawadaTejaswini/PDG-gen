import java.util.*;
public class Main {

	static boolean isprime(int p){
		for (int i=2;i<p; i++){
			if(p%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int prime[]=new int[N];
		int j= N-1;
		for(int i=2; i<55555;i++){
			if(isprime(i)==true && i%5==1){
					prime[j]=i;
					j=j-1;
					if(j<0){
						break;
					}
			}
		}
	for(int i=N-1;i>=0;i--){
		System.out.print(prime[i]+" ");
	}
	System.out.println();
	}
}
