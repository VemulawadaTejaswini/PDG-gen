public class ITP1_3_B {

	public static void main(String[] args) {
		int i = 1;

		do {

			Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();

	        if (x == 0) {
	        	sc.close();
	        	break;
	        }else {
	        	System.out.println( "Case "+ i +":"+" "+ x );
				i++;
				continue;
	        }

		}while(true);

	}

}
