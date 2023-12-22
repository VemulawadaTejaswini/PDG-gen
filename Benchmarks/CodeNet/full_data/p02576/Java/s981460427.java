import java.util.*;
import java.io.*;
class Main{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		int n = in.nextInt();
		int x = in.nextInt();
		int t = in.nextInt();
		int time = 0;

		while(n!=0){
			n = Math.max(n-x, 0);
			time += t;
		}

		out.println(time);
	}
}
