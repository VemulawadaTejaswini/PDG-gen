public class X_Cubic {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String strInput = scan.next();
		int numInput = Integer.parseInt(strInput);
		int result = numInput*numInput*numInput;
		System.out.println(result);
	}
}