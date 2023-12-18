public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		String str4 = sc.nextLine();

		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int c = Integer.parseInt(str3);
		int d = Integer.parseInt(str4);

		int train;
		int bus;

		if(a > b) {
			train = b;
		}else {
			train = a;
		}


		if(c > d) {
			bus = d;
		}else {
			bus = c;
		}

		System.out.println(train+bus);


		sc.close();
	}

}
