import java.util.*;
public class Herewego {


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b;
		a=input.nextInt();
		b=input.nextInt();
		int x=a-1;
		int y=b-1;
		int n=Math.max(Math.max(x+a,y+b), a+b);
				System.out.println(n);	
	}

}
