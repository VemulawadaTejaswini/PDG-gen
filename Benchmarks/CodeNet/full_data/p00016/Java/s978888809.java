import java.io.IOException;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		double x = 0;
		double y = 0;
		int angle = 90;
		while(true){
			String str = bf.nextLine();
			String[] tmp = str.split(",");
			int dist = Integer.parseInt(tmp[0]);
			int role = Integer.parseInt(tmp[1]);
			if(dist == 0 && role == 0) break;
			x += Math.cos(Math.toRadians((double)angle)) * dist;
			y += Math.sin(Math.toRadians((double)angle)) * dist;
			angle -= role;
		}
		System.out.println((int)x);
		System.out.println((int)y);
		bf.close();
	}
}