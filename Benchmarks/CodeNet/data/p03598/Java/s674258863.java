public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum =0;
		for (int i=0;i<N;i++) {
			int a= sc.nextInt();
			if (K-a<a) {
				sum = sum + (K-a)*2;
			} else {
				sum = sum + 2*a;
			}
		}
		System.out.println(sum);
	}
}
