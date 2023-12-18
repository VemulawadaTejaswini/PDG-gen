public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double result = 0;
		for (int i= 1 ; i <= n ; i++) {
			double a = i;
			double num = 0;
			while(a <= k) {
				a = a * 2;
				num++;
			}
			
			double add = (Math.pow(0.5, num)) * (1/(double)n);
			result += add;
		}
		System.out.println(result);
	  }
}