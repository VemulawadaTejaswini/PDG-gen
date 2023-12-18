public class Judge{
	public static void main(String[] args){

		String a = new java.util.Scanner( System.in ).nextLine();
		String b = new java.util.Scanner( System.in ).nextLine();

		if( a.equals("H")){
			if( b.equals("H")){
				System.out.println("H");
			}
			if( b.equals("D")){
				System.out.println("D");
			}
		}
		if( a.equals("D")){
			if( b.equals("H")){
				System.out.println("D");
			}
			if(b.equals("D")){
				System.out.println("H");
			}
		}
	}
}