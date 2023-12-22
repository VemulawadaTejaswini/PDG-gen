public class Main{
	public void run(java.io.InputStream in,java.io.PrintStream out){
		java.util.Scanner sc = new java.util.Scanner(in);

/*answer*/
		int N, M;
		int[] b, p;
		int od, ev, ze, i, count;

		N = sc.nextInt();
		M = sc.nextInt();
		b = new int[N];
		p = new int[M];
		od = 0;
		ev = 0;
		ze = 0;
		count = 0;

		for(i = 0;i < N;i++){
			b[i] = sc.nextInt();
			if(b[i] == 0)ze++;
		}
		for(i = 0;i < M;i++){
			p[i] = sc.nextInt();
			if(i % 2 == 0){
				ev += p[i];
			}else{
				od += p[i];
			}
		}
		sc.close();

		if(ev != od){
			if(ev == ze){
				count = zerosort(b, p, N, M);
			}else{
				for(i = 0;i < N;i++){
					b[i] = (b[i] + 1) % 2;
				}
				count = zerosort(b, p, N, M);
			}
		}else{
			count = zerosort(b, p, N, M);
			for(i = 0;i < N;i++){
				b[i] = (b[i] + 1) % 2;
			}
			ze = zerosort(b, p, N, M);
			if(count > ze)count = ze;
		}

		System.out.println(count);

	}
	public static void main(String[] args){
		(new Main()).run(System.in,System.out);
	}

	private static int zerosort(int[] b, int[] p, int N, int M){
		int i, j, k, a, count, xx;
		int[] ans, b2;

		ans = new int[N];
		b2 = new int[N];

		a = 0;
		k = 0;
		count = 0;
		for(i = 0;i < M;i++){
			for(j = 0;j < p[i];j++){
				ans[j + k] = a;
			}
			k += p[i];
			a = (a + 1) % 2;
		}

		for(i = 0;i < N;i++){
			b2[i] = b[i];
		}

		for(i = 0;i < (N - 1);i++){
			for(j = i;j < N;j++){
				if(ans[i] == b2[j]){
					a = b2[i];
					b2[i] = b2[j];
					b2[j] = a;
					count = count + (j - i);
					break;
				}
			}
		}
		return count;
	}
}