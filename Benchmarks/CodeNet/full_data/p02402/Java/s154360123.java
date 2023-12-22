public class Main {


		public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a, b, c, d, e;
		long f;
		a = scan.nextInt();
		d = -1000000;
		e = 1000000;
		f = 0;
		if(0 <= a && a <= 10000){
		for(b = 1; b <= a ; b++){
		
			c = scan.nextInt();
		 if(-1000000<=c && c <= 1000000){
			
			if(c >= d){
				d = c;
			}
			if(c <= e){
				e = c;
			}
			f += c;
		}
	
		}
		}
		
		System.out.print(e+" ");
		System.out.print(d+" ");
		System.out.println(f);
		}
		



		}