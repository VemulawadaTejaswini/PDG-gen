public class Go {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String x = "";
		x = s.next();
		char[] c = new char[2];
		c[0] = x.charAt(0);
		c[1] = x.charAt(1);
		
		if(c[0] == c[1]){
			System.out.println('H');
		} else {
			System.out.println('D');
		}
		
	}
}