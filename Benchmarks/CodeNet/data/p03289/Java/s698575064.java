public class AcCeptedMain {

	public static void main(String S) {
		// TODO Auto-generated method stub
		return (aCheck(S)&&cCheck(S)&&sCheck(S))?"AC":"WA";				
	}
	private static boolean aCheck(String str){
		return str.matches("^A.*");
	}
	
	private static boolean cCheck(String str){
		return str.matches("^.{3}.*C.*.{2}$");
	}
	
	private static boolean sCheck(String str){
		return str.matches("^.[a-z]*C[a-z]*$");
	}

}