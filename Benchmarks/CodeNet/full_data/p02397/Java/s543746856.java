public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int x;
		int y;

		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			if (x == 0 && y == 0) { break; }
			if (x > y) {
				int z = x;
				x = y;
				y = z;
			}
			sb.append(x).append(" ").append(y).append("\n");
		}
		System.out.print(sb.toString());
	}
}