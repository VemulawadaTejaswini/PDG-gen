import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String S = input.next();
		int w = input.nextInt();
		String t="";
		
		for (int i=0;i<S.length();i++)
		{
			if (i%w==0) 
				System.out.print(S.substring(i, i+1)); 
		}		
	}
}
