public class atcode {

	public static void main(String[] args) {
		String s = args[0];
		int count =0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				System.out.println("Bad");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Good");
		}

	}

}
