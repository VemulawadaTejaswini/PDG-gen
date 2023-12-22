public class Main {
	public static void main(String[] args) {
		int price;
		int n;
		int all = 0;
		int allN = 0;
		int rCount = 0;
		for (Scanner in = new Scanner(System.in); in.hasNext();) {
			String[] r = in.next().split(",");
			price = Integer.parseInt(r[0]);
			n = Integer.parseInt(r[1]);
			all += price * n;
			allN += n;
			rCount++;
		}
		System.out.println(all);
		System.out.println(Math.round((float) allN / rCount));
	}
}