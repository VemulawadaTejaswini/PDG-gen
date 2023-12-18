class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cost = 0;
		if (a >= 13) {
			cost = b;
		} else if (a >= 6 && a <= 12) {
			cost = b /2;
		} else {
			cost = 0;
		}
		System.out.println(cost);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
	}
}