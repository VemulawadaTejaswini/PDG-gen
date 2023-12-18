public class Main {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();

		boolean flg = false;

		flg = (x<100);

		for(int i = 2 ; 100*i == 1900 ; i++ ) {
			flg = flg && (((i-1)*105 < x) && (x < i*100));
		}
		
		if(flg) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}


	}
}
