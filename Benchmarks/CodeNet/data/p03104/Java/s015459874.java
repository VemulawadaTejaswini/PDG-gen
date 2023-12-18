	public static void main(String[] args) {
//		{
//			Scanner in = new Scanner(System.in);
//			long a = in.nextLong();
//			long b = in.nextLong();
//			long ret = 0;
//			for (long i = a; i <= b; i++) {
//				ret ^= i;
//			}
//			System.out.println(ret);
//		}
		{
			Scanner in = new Scanner(System.in);
			long a = in.nextLong();
			long b = in.nextLong();
			long ret = 0;
			{
				long count = (b - a + 1) % 4;
				for (long i = a; i < count; i++) {
					ret ^= i & 1;
				}
			}
			int p = 2;
			while (b >= p) {
				long count = (b - a + 1) % p;
				for (long i = a; i < count; i++) {
					ret ^= i & p;
				}
				p *= 2;
			}
			System.out.println(ret);
		}
	}
}
