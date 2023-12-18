public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextInt();
		sc.close();
		double s=100;
		int k=0;
		while(s<X) {
			s+=s*0.01;
			k++;
		}
		System.out.println(k);
	}

}