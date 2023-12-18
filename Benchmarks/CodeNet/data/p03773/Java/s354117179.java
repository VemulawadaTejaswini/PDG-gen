public class Main{
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int A =sc.nextInt();
		int B =sc.nextInt();
		int K;
		K=A+B;
		if(K>=24){
			K=K-24;
		}
		System.out.println(K);
	}

}
