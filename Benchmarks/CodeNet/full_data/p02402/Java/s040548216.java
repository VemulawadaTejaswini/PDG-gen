public class Main {


		public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a, b, c, d, e, f;
		a = scan.nextInt();
		b = 1;
		d = 0;
		e = 10000;
		f = 0;
		do{
		if(0<=a && a <= 10000){
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
		b += 1;
		}
		}while(b <= a);
		
		System.out.print(e+" ");
		System.out.print(d+" ");
		
		System.out.println(f);
		}
		



		}