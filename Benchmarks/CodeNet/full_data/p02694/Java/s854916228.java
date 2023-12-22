import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long  X = s.nextLong();
	    long money =100;
		long Xyear =0;
		while( money < X ) {
			money *= 1.01;
			Xyear++;
		}
		System.out.println(Xyear);
	}

}