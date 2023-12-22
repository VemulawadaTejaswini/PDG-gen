public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

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