import java.util.*;
public class Main {
	static int p = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int m = (x+y)/3;
		int n =  y-m;
		if((x+y) % 3 != 0 || m < n || n < 0)
			System.out.println(0);
		else{
			long[] mm = new long[1000005];
			long[] nn = new long[1000005];
			
			mm[0] = 1;
			for(int i=1;i<mm.length;i++){
				mm[i] = mm[i-1] * i % p;
			}

			nn[0] = 1;
			nn[1] = 1;
			for(int i=2;i<nn.length;i++){
				nn[i] = nn[i-1] * fp(i, p-2) % p;
			}
			
			System.out.println(mm[m] * nn[n] % p * nn[m-n] % p);
		}
	}
	static long fp(int a, int k){
		
		if(k == 0)
			return 1;
		
		long num = fp(a, k/2);
		if(k % 2 != 0)
			return a * num % p * num % p;
		else
			return num * num % p;
	}
}