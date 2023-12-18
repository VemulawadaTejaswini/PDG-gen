
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	     
		 String S = sc.next();
		 
		 char[] ch = new char[4];
		 for(int a=0;a<ch.length;++a)
		 {
			 ch[a] =S.charAt(a);
		 }
		 
		 int index=0;

		 for(int q=0;q<S.length()-1;++q)
		 {
			 for(int w=q+1;w<S.length();++w)
			 {
				 if(ch[q] == ch[w])
				 {
					 ++index;
				 }
			 }
		 }
		 if(index==2)
		 {
			 System.out.println("YES");
		 }
		 else
			 System.out.println("NO");
	}
	}

