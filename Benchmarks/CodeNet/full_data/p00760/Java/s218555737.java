import java.util.*;

public class Main{
	public static int solve(int y, int m, int d){
		int x = 1000-y;
		int day = x*195;
		if( x%3 == 0 ){
			day += (x/3)*5;
		} else {
			day += (x/3 + 1)*5;
		}
		if( y%3 == 0 ){
			day -= (m-1)*20+d-1;
		} else {
			day -= ((m-1)/2)*39+((m-1)%2)*20+d-1;
		}
		return day;
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++){
			int y = stdIn.nextInt();
			int m = stdIn.nextInt();
			int d = stdIn.nextInt();
			System.out.println(solve(y, m, d));
		}
	}
}