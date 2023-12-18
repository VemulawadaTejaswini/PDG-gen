public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M, sum = 0, cnt = 0;
		N = sc.nextInt();
		M = sc.nextInt();
		int[] Arr = new int[N];
		for (int i = 0; i < N; i++) {
			Arr[i] = sc.nextInt();
			sum += Arr[i];
		}
		
		for(int i = 0; i<N; i++) {
			if(Arr[i]>=sum/4/M) {
				cnt++;
			}
		}
		System.out.println(cnt<M?"No":"Yes");

	}
}
