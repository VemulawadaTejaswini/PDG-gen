import java.util.*;

public class Main {

	static boolean[] isPrime = new boolean[10000001];
	static int cnt=0;
	static int[] a = new int[664579];
	static{
		Arrays.fill(isPrime,true);
		isPrime[0]=isPrime[1]=false;
		for(int i = 4; i < isPrime.length;i+=2){
			isPrime[i]=false;
		}
		for(int i = 3; i*i<=isPrime.length;i+=2){
			if(isPrime[i]){
				for(int j = i+i; j < isPrime.length; j+=i){
					isPrime[j]=false;
				}
			}
		}

		for(int i = 0; i < isPrime.length;i++){
			if(isPrime[i]){
				a[cnt++]=i;
			}
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}

			int bs = Arrays.binarySearch(a, n);
			int start =0;
			if(bs<0){
				start = -2-bs;
			}
			else{
				start = bs;
			}
			for(int i = start; i >= 0; i--){
				if(a[i]-a[i-1]==2){
					if(a[i-1]-a[i-2]==4){
						if(a[i-2]-a[i-3]==2){
							System.out.println(a[i]);
							break;
						}
					}
				}
			}

		}
	}

}