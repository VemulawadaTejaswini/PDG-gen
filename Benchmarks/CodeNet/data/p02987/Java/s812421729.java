import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		char b=' ',c=' ';
		int z=0,y=0,x=0;
		while(z<4){
			char a=S.charAt(z);
			if(b==' ')
				b=a;
			else
				if(a!=b&&c==' ')
					c=a;
			if(a==b)
				y++;
			if(a==c)
				x++;
			z++;
		}
		if(y==2&&x==2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}