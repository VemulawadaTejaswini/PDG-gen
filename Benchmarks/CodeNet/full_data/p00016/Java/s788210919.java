import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in))).useDelimiter("(,|\n)");
		int d=0,t=0,l=0;
		double x=0.0,y=0.0;
		do{
			l=sc.nextInt();
			t=sc.nextInt();
			x+=(double)Math.cos((double)d*Math.PI/180)*l;
			y+=(double)Math.sin((double)d*Math.PI/180)*l;
			d+=t;
			t=(t<0)?(t+360):((t>360)?t-360:t);
		}while(l!=0||t!=0);
		System.out.println((int)y);
		System.out.println((int)x);

	}
}