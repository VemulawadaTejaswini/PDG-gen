import java.util.*;

public class Main{
//public class abc165_b{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		int con = 0;
		long a = 100;

		while(true){
			con++;
			a += a/100;
			if(a >= x){
				System.out.println(con);
				break;
			}

		}
	}

}