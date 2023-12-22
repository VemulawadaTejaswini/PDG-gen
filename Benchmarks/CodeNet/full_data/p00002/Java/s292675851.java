import java.util.Scanner;
public class Main {
	public static void main(String[] a) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),z,i;
		z=x+y;
		for(i=1;10<=z;i++){
			z=z/10;
		}
		System.out.println(i);
	}
}