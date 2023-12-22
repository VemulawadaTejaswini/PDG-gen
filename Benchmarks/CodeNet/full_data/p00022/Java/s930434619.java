import java.util.Random;
class mss {

	public static void main(String[] args) {
		Random stdIn = new Random();
		int n = stdIn.nextInt(3) + 1;
		int[] a = new int[n];
		for(int i = 1;i <= n;i++){
			a[i] = stdIn.nextInt(200001) - 100000;
		}
		int mss = a[1];
		int[] b = new int[n];
		int sum = 0;
		for(int i = 1;i <= n;i++){
			b[i] = sum + a[i]; 
			sum += a[i];
		}
		for(int i = 1;i <= n;i++){
			if(mss < b[i])
				mss = b[i];
		}
		System.out.println(n);
		for(int i = 1;i <= n;i++){
			System.out.println(a[i]);
		}
		System.out.println(mss);
	}

}