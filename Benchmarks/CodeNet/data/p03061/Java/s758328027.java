	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int[] A = new int[n];

		for(int i=0;i<n;i++)
			A[i] = sc.nextInt();

		Arrays.sort(A);

		boolean flg = true;
		int counter = 1;
		int max = 1;

		for(int i=1;i<n;i++){
			if(A[i]%A[n-1]!=0){
				if(counter>0){
					counter--;
				} else {
					flg = false;
					break;
				}
			}	
		}

		if(flg){
			max = A[n-1];
		} else {
			for(int m=A[n-1]/2;m>1;m--){
				counter = 1;
				flg = true;
				for(int i=0;i<n;i++){
					if(A[i]%m!=0){
						if(counter>0){
							counter--;
						} else {
							flg = false;
							break;
						}
					}	
				}
				if(flg){
					max = m;
					break;
				}
			}
		}

		// 出力
		System.out.println(max);
	}
}