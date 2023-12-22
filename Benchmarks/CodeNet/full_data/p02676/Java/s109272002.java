
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
			int A = sc.nextInt();
			String B = sc.next();
			
			if (A > B.length()) {
				System.out.println(B);
			}else {
				System.out.println(B.substring(0,A)+"...");
			}
	}

