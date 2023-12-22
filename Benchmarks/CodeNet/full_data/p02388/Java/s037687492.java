class Main {
	public static void main(String[] args) {
		try {
			int num =  Integer.parseInt(args[0]);
			System.out.println(num * num * num);
			System.out.println();
		} catch (Exception e) {
		}
	}
}