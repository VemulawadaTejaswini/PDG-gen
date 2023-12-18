
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = args[0];
		if(s != null){
		if(s.substring(0,4).equals("YAKI")){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		}
		else{
			System.out.println("No");
		}
	}

}