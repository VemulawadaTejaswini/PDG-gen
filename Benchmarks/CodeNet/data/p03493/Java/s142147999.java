public class Main {

	public static void main(String[] args) {
		Main solution = new Main();
		Scanner sca = new Scanner(System.in);
		int ans = 0;
		String str = sca.next();
		ans = solution.oneCount(str);
		System.out.println(ans);
		sca.close();
	}
	
	public int oneCount(String string) {
		int res = 0;
		for (int i = 0; i < string.length(); i++) {
			String s = string.substring(i, i+1);
			if (s.equals("1")) {
				res++;
			}
		}
		return res;
	}

}
