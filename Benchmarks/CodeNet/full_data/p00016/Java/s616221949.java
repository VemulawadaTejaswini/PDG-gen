import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		String str = stdIn.next();
		int index = 0;
		String[][] s = new String[10000][2];
		double x = 0;
		double y = 0;
		double angle = 90;

		while( !str.equals("0,0") ){
			s[index] = str.split(",");
			int r = Integer.parseInt(s[index][0]);			
			x += r*Math.cos((angle%360)*Math.PI/180);
			y += r*Math.sin((angle%360)*Math.PI/180);
			str = stdIn.next();angle -= Integer.parseInt(s[index][1]);
			index++;
		}
		
		System.out.println((long)x);
		System.out.println((long)y);
	}
}