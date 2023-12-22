public class Main {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int sum=0;
		int max=-100000;
		int[] a = new int[5000];

		n = Integer.parseInt(br.readLine());
		if (n != 0) {
			for(int i=1; i<=n; i++) {
				a[i] = Integer.parseInt(br.readLine());
			}
			
			for (int i=1; i<=n; i++) {
				for (int j=i; j<=n; j++) {
					sum += a[j];
				}

				if (max<sum) {
					max = sum;
				}
				sum = 0;
			}
	        System.out.println(max);
		}
		else {
			return;
		}
		
	}
}