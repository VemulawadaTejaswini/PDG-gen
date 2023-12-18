import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		char a=' ',b=' ';
		int z=0,y=0;
		boolean fin=false;
		char c=S.charAt(0);
		a=c;
		c=S.charAt(1);
		if(a==c)
			z=2;
		else
			b=c;
		c=S.charAt(2);
		if(c==a){
			if(z==2)
				fin=true;
			else
				z=2;
		}
		if(c==b)
			y=2;
		c=S.charAt(3);
		if(c==a)
			if(z==2)
				fin=true;
			else
				z=2;
		if(c==b)
			if(y==2)
				fin=true;
			else
				y=2;
		if(fin)
			System.out.println("No");
		else
			if(z==2&&y==2)
				System.out.println("Yes");
			else
				System.out.println("No");
	}
}