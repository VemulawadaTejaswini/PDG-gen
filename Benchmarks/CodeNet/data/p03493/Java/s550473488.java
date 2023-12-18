import java.io.IOException;
public class Main{
	public static void main(String args[]) throws IOException{
		byte a[] = new byte[3];
		System.in.read(a);
		a[0] &= 1;
		a[1] &= 1;
		a[2] &= 1;
		System.out.println(a[0]+a[1]+a[2]);
	}
}
