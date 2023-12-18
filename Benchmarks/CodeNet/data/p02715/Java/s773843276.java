import java.util.Arrays;
import java.util.Scanner;
 
class Main {
	long sum;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Main m = new Main();
		int[] a = new int[n];
		m.fill(a,n,k,0);
		System.out.println((m.sum%(1000000007)));
	}
	Main(){
		sum = 0;
	}
	int gcd(int a, int b){
		if((a%b!=0)){
			return gcd(b,a%b);
		}
		return b;
	}
	int gcd(int[] a){
		if(a.length>1){
			int[] b = new int[a.length-1];
			System.arraycopy(a,0,b,0,a.length-1);
			return gcd(gcd(b),a[a.length-1]);
		}else{
			return a[0];
		}
	}
	
	void fill(int[] a,int n,int k,int dig){
		for(int i=1;i<=k;i++){
			a[dig] = i;
			if(dig!=n-1){
				if(a[dig+1]==k){
					a[dig+1]=1;
				}
				fill(a,n,k,dig+1);
			} else {
				sum += gcd(a);
			}
		}
	}
}
