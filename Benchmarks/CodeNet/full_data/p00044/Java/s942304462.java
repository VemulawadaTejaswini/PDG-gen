import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = 60000/2;
		int[] prime = sieve(N);
		while(scan.hasNext()){
			int x = scan.nextInt();
			if(x == 3){
				System.out.println(2 + " " + 5);
				continue;
			}
			int prev = 2;
			for(int i = 0;i < N;i++){
				if(prime[i] == 1){
					if((2*i+1) > x){
						System.out.println((2*prev+1) + " " + (2*i+1));
						break;
					}
					if((2*i+1) != x){
						prev = i;
					}
				}
			}
		}
	}
	public static int[] sieve(int N){
		int[] v = new int[N];
		for(int i = 0;i < N;i++){
			v[i] = 1;
		}
		int p = 3;
		while(true){
			if(p*p > N){
				break;
			}else{
				if(v[(p-1)/2] == 0){
					p += 2;
				}else{
					int t = p*p;
					while(t < N){
						v[(t-1)/2] = 0;
						t += 2*p;
					}
					p += 2;
				}
			}
		}
		return v;
	}
}