	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int sum = a+c;
		if(a+d < sum)sum = a+d;
		if(b+c < sum)sum = b+c;
		if(b+d < sum)sum = b+d;
		System.out.println(sum);
	}
