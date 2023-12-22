import java.util.*;

public class Main{
	public static void main(String[] args){
		int S = new Scanner(System.in).nextInt();
		int h = S / (60 * 60);
		int m = S % (60 * 60) / 60;
		int s = (S % (60 * 60)) % 60;
		System.out.println(h + ":" + m + ":" + s);
	}
}