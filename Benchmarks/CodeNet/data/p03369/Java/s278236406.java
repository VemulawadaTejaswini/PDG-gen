	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ramen = 700;
		char[] ary = sc.next().toCharArray();
		for (char c : ary) {
			if(c == 'o') ramen += 100;
		}
		System.out.println(ramen);
	}