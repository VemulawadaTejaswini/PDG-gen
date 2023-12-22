import java.util.*;

public class Main{

	public static void main(String[] args) throws 

java.io.IOException{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if ( a > b ){
			System.out.println(a + ">" + b);
		}else if ( a < b ){
			System.out.println(a + "<" + b);
		} else{
			System.out.println(a + "=" + b);
		}
	}
}