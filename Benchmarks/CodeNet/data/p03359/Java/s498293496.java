import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String a = s.next();
		int b = s.nextInt();
		DecimalFormat df1 = new DecimalFormat("00");
		String bb=df1.format(b);

		int c=Integer.parseInt(a+bb);

		if(101<c&&c<202){
			System.out.println(1);
		}else if(201<c&&c<303){
			System.out.println(2);
		}else if(302<c&&c<404){
			System.out.println(3);
		}else if(403<c&&c<505){
			System.out.println(4);
		}else if(504<c&&c<606){
			System.out.println(5);
		}else if(605<c&&c<707){
			System.out.println(6);
		}else if(706<c&&c<808){
			System.out.println(7);
		}else if(807<c&&c<909){
			System.out.println(8);
		}else if(908<c&&c<1010){
			System.out.println(9);
		}else if(1009<c&&c<1111){
			System.out.println(10);
		}else if(1110<c&&c<1212){
			System.out.println(11);
		}else{
			System.out.println(12);
		}





	}

}
