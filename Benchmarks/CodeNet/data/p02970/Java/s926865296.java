public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int cal = n/(2*d+1)+(n%(2*d+1)==0?0:1);
		System.out.println(cal);

	}
}
