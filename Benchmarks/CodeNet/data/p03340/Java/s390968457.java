public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextLong();
		}
		long res = 0;
		int r = 0;
		long sum = 0;
		for(int l=0;l<n;l++) {
			 while(r<n && (sum^a[r])==(sum+a[r])) {
				 sum += a[r++];
			 }
			res += r-l;
			sum -= a[l];
			if(l==r) r++;
		}
		System.out.println(res);
		in.close();
	}

}