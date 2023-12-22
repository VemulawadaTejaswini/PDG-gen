
import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int W= sc.nextInt(), H=sc.nextInt();
		int x=sc.nextInt(), y=sc.nextInt(), r=sc.nextInt();
		
		System.out.println
			( (H>=y+r && y-r>=0 && W>=x+r && x-r>=0)? "Yes" : "No" );

	}
}