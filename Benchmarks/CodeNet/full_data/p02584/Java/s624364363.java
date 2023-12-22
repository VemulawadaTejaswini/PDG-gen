import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long x = Math.abs(sc.nextLong());
			long k = sc.nextLong();
			long d = sc.nextLong();
			long num;
			long ret;
			
			long kirisute = x/d;
			long kiriage = (x+d-1)/d;
			
			if(k<=kirisute) {
				num = k;
				ret = x-(d*num);
				System.out.println(ret);
				return;
			}
			
			long sutedistance = x-kirisute*d;
			long agedistance = kiriage*d-x;
			
			if(sutedistance<=agedistance) {
				num = kirisute;
				
			}else {
				num = kiriage;
			}
			
			ret = Math.abs(x-num*d);
			
			if((k-num)%2==0) {
				System.out.println(ret);
			}else {
				System.out.println(Math.abs(ret-d));
			}
	    }
				
	}
	
