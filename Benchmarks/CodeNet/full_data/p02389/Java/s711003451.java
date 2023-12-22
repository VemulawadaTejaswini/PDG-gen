import java.util.Scanner;

public class Main { 
	public static void main(String[] args){
		String str;
		int i1, i2;;

		Scanner scan = new Scanner(System.in);

		str = scan.next();
		i1 = Integer.parseInt(str);
		
		str = scan.next();
		i2 = Integer.parseInt(str);

		System.out.println(i1*i2 + " " + 2*(i1+i2));
	}
}