public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0;
		String op = null;
		
		try {
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(op.equals("+")) {
			System.out.println(a+b);
		}else if(op.equals("-")) {
			System.out.println(a-b);
		}else if(op.equals("*")) {
			System.out.println(a*b);
		}else if(op.equals("/")) {
			System.out.println(a/b);
		}
		
	}

}