import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner pw = new Scanner(System.in);
		String S = pw.next();
		String T = pw.next();
		int count = 0;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)==T.charAt(i)){count++;}
		}
		System.out.println(count);
		
		
	}
	

}
