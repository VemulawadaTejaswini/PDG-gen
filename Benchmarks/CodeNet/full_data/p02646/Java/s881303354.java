import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args){
		// input
		//  A V
		//  B W
		//  T
		Scanner inData = new Scanner(System.in);
		StringTokenizer line1 = new StringTokenizer(inData.nextLine());
		long a = Long.parseLong(line1.nextToken());
		long v = Long.parseLong(line1.nextToken());
		StringTokenizer line2 = new StringTokenizer(inData.nextLine());
		long b = Long.parseLong(line2.nextToken());
		long w = Long.parseLong(line2.nextToken());
		long t = Long.parseLong(inData.nextLine());
		
		if ((a+v*t) >= (b+w*t)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		inData.close();
	}
}
