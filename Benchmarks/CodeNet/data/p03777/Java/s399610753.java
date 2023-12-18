public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next() ;
		String b = sc.next() ;
		char A = a.charAt(0);
		char B = b.charAt(0);
		
		if(A == 'H' && B == 'H'){
			System.out.println('H');
		}
		if(A == 'H' && B == 'D'){
			System.out.println('D');
		}
		if(A == 'D' && B == 'H'){
			System.out.println('D');
		}
		if(A == 'D' && B == 'D'){
			System.out.println('H');
		}
	}
}