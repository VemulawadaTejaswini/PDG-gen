import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int K = sc.nextInt();

		int p[] = new int[N];
		for(int i=0; i<N; i++){
			p[i] = sc.nextInt();
		}
		double karray[] = new double[N];
		double max = 0;
		
		
		int maxindex = 0;
		for(int i=0; i<(N-K+1); i++){
			double sum = 0;
			for(int j=0; j<K; j++){
				sum += p[i+j];
			}

			if(sum > max){
				max = sum;
				maxindex = i;
			}
		}
		double kitaichisum = 0;
		for(int i=maxindex; i<maxindex+K; i++){
			kitaichisum += kitaichi(p[i]);
		}

		System.out.println(kitaichisum);

	}

	public static double kitaichi(int n){
		double k = (double)add(n)/(double)n;
		return k;
	}

	public static int add(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++){
			sum += i;
		}
		return sum;
	}
}


