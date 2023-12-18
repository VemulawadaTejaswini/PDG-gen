class Main {
	public static boolean contest (int required, int accepted) {
		if (required == accepted) {
			return true;
		}
		else return false;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int required = input.nextInt();
		int accepted = input.nextInt();
		if (contest(required, accepted) == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
