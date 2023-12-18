public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
		int N = sc.nextInt();
		String S = sc.next();
		
		int res = 0;
		int count = 0; 
		for(int i = 0; i < N; i++) {
			if('I' == S.charAt(i)) count++;
			else count--;
			res = Math.max(res, count);
		}
		
		System.out.println(res);
	} // Scanner Close
    }
}