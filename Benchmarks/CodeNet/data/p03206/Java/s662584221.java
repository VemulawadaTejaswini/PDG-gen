	public static void solution(int D) {
		if(D>25 || D<22) {
			throw new IndexOutOfBoundsException("the value of D is out");
		}
		int root = 25 - D;
		String str = "Christmas";
		while(root > 0) {
			str += " Eve";
			--root;
		}
		System.out.println(str);
	}