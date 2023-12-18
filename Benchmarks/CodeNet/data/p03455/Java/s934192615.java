public class Main {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int prd = a * b;
		String ans = "";
		if (prd % 2 == 0){
			ans = "Even";
		} else {
			ans = "Odd";
		}
		System.out.println(ans);

	}

}
