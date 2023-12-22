import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		if(b < c)
			System.out.println(b+" "+c);
		else if(b > c)
			System.out.println(c+" "+b);
		else 
			System.out.println(c+" "+b);
		while(b != 0 && c != 0){
		b = a.nextInt();
		c = a.nextInt();
		if(b < c)
			System.out.println(b+" "+c);
		else if(b > c)
			System.out.println(c+" "+b);
		else 
			System.out.println(c+" "+b);
		}
	}

}