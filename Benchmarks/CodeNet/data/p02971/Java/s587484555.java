public class Main {
	Scanner scan = new Scanner(System.in);
	
	
	void compute() {
		int N = scan.nextInt();
		int[] t = new int[N];
		for(int i=0; i<N; i++) {
			t[i] = scan.nextInt();
		}
		for(int i=0; i<N; i++) {
			int m = 0;;
			for(int n=0; n<N; n++) {
				if(n !=  i) {
					if(t[n] > m) {
						m = t[n];
					}
				}
			}
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		new Main().compute();
	}

}
