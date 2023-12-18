public static void main(String[] args) {
		int N = 6;
		int P = 3;
		int [] time = {1,4,10,2,6,3};
		int [] drinktime = {4,2,5,4,3,9};
		int sum = 0;
		for(int i = 0; i < N; i++){
			sum = sum + time[i];
		}
		for(P = 0; P < drinktime.length; P++){
		sum = sum + drinktime[P] - time[P];
		System.out.println(sum);
	}
	}