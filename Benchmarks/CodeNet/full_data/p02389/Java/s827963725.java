public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int intAns = 0;
		int intAns1 = 0;
		//	System.out.println("??°????????\?????????????????????");
			int intTate = sc.nextInt();
			int intYoko = sc.nextInt();
			intAns = intTate * intYoko;
			intAns1 = intTate * intTate + intYoko * intYoko;
			System.out.println(intAns+ " " +intAns1);
	}
}