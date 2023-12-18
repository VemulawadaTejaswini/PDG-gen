public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
				
		System.out.println((int)round((n-2) / 2,0));

	}
	public static double round(double a,int place) {
		double ans;

		int k = (int)Math.round(a * Math.pow(10,place));
		ans = k / Math.pow(10, place);
			
		return ans;
	}
