class Main{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if(-1000 <= a && b <= 1000){
			if (a < b) {
				System.out.println("a < b");
			}

			else if(a > b){
				System.out.println("a > b");
			}

			else if (a == b) {
				System.out.println("a == b");
			}
		}
	}
}