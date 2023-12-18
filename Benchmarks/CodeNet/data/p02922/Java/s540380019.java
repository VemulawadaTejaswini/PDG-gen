public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int count = 1;
		for(int i=1;;i++) {
			count += a-1;
			if(b<=count) {
				System.out.println(i);
				break;
			}
		}
	}
}