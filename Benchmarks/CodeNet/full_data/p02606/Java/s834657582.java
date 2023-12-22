public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		int ans = 0;
		if(l%d==0) {
			ans++;
		}
		for(int i = l; i < r; i += d ) {
			ans++;
		}
		System.out.println(ans);
		sc.close();
	}
}