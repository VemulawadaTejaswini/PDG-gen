public  void solve(int testNumber, InputReader in, PrintWriter out) {
		System.out.println("Enter data");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int T[] = new int[N];
		for(int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
		}
		int res = 1;
		int people = 0;
		int start = T[0] + K;
		
		int j = 0;
		
		while(j < N) {
			while(people < C && T[j] < start) {
				people++;
				j++;
			}
			res++;
			start = T[j] + K;
			j++;
		}
		
		System.out.println("Res = " + res);
		
				
	}