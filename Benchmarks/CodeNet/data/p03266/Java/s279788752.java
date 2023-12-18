public class Main {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int count =0;
		boolean f1,f2,f3;

		for(int a = 1;a<=n;a++) {
			for(int b=1;b<=n;b++) {
				for(int c=1;c<=n;c++) {
					f1 = (a+b)%k==0;
					f2 = (b+c)%k==0;
					f3 = (c+a)%k==0;
					if(f1&&f2&&f3) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}