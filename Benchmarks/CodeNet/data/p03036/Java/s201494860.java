import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int r=stdIn.nextInt();
		int D=stdIn.nextInt();
		int x=stdIn.nextInt();
		int z=0;
		while(z<10){
			x=x*r-D;
			System.out.println(x);
			z++;
		}
	}
}