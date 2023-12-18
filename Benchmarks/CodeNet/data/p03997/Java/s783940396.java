import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner gio = new Scanner(System.in);
		int a = gio.nextInt();
		int b = gio.nextInt();
		int h = gio.nextInt();
		System.out.println((double)((a + b) * h)/(double)2);
	}
}