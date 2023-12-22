package Lesson;
//ITP_1_1B X Cube
import java.util.Scanner;
public class Itp1_1B {
	//?????°
	public static int x;
	//????????????
	public static void solve(){
		System.out.println( x*x*x );
	}
	
	public static void main( String[] args ){
		Scanner	sc = new Scanner( System.in );
		x = sc.nextInt();
		
		solve();
	}
}