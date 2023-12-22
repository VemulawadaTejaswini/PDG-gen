public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		sc.nextLine();
		String[] data = sc.nextLine().split(" ");

		for ( int i = n-1; 1 <= i; i--) {
//			if (i==0) {
//				sb.append(data[i]);
//				break;
//			}
			sb.append(data[i] + " ");
		}

		System.out.println( sb.append(data[0]) );
	}

}