public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print(" ");
		Scanner sc = new Scanner(System.in);

		//人数
		int N = sc.nextInt();
		int[] A = new int[N];
		//絶対値の入力
		int[] a = new int[N];
        double P;
		for(int i = 0; i < N ;i++){

			a[i] = sc.nextInt();
			A[i] = Math.abs((2 * i) - N + 1);
		}
		Arrays.sort(A);
		Arrays.sort(a);
		if(Arrays.equals(A,a)){
			 P = Math.floor(N/2)  *  Math.floor(N/2);
			 
		}else{
			 P = 0;
		}
		System.out.println(P / (Math.pow(10, 9) + 7));
	}