public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		if(n.contentEquals("A")) {
			System.out.println("T");
		}else if(n.contentEquals("T")) {
			System.out.println("A");
		}else if(n.contentEquals("C")) {
			System.out.println("G");
		}else {
			System.out.println("C");
		}
		//System.out.println(ans);
		sc.close();
	}
}
