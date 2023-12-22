
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d,r;
		float f;
		d = b/c;
		r = b - (c * d);
		f = (float)b/(float)c;
		System.out.println(d+" "+r+" "+f);
	}

}