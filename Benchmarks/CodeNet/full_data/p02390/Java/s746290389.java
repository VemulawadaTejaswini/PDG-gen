public class Main {
	public static void main(String[] args) {

		int S;//??????????§???????
		int h;		int m;		int s;
		int Wm;

		//S = new java.util.Scanner(System.in).nextInt();
	        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int S = Integer.parseInt(br.readLine());
                
	
		s = S % 60;
		Wm = S / 60;
		
		m = Wm % 60;
		h  = Wm / 60;
		System.out.print( h + ":" + m + ":" + s );
	}
}