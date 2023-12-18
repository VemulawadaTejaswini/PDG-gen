public static void main(String[] args) {

		Scanner a = new Scanner(System.in);

		int H = a.nextInt();
		int W = a.nextInt();
		Scanner b = new Scanner(System.in);
		int h = b.nextInt();
		int w = b.nextInt();
		int ans = (H - h) * (W - w);
		System.out.println(ans);

	}
