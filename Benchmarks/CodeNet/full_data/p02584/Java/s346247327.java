class Main{

	public static void main (String[] args) {

		Main main = new Main();

		java.util.Scanner sc = new java.util.Scanner(System.in);

		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();

		long nowplace = X;

		if (X>0) {
			long count = X/D;
			if (X%D!=0) {
				count++;
			}
			if (count<K) {
				nowplace = X-(count*D);
				if (count==K) {
					System.out.println(Math.abs(nowplace));
				} else if ((K-count)%2==0) {
					System.out.println(Math.abs(nowplace));
				} else {
					System.out.println(Math.abs(nowplace+D));
				}
			} else {
				nowplace = X-(K*D);
				System.out.println(Math.abs(nowplace));
			}
		} else {
			long count = Math.abs(X)/D;
			if (X%D!=0) {
				count++;
			}
			if (count<K) {
				nowplace = X+(count*D);
				if (count==K) {
					System.out.println(Math.abs(nowplace));
				}
				if ((K-count)%2==0) {
					System.out.println(Math.abs(nowplace));
				} else {
					System.out.println(Math.abs(nowplace-D));
				}
			} else {
				nowplace = X+(K*D);
				System.out.println(Math.abs(nowplace));
		}
		sc.close();
		}
	}
}