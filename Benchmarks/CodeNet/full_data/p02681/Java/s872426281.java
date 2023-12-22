import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String s=scan.nextLine();
		String t=scan.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==t.charAt(i))
			{
				c+=1;
			}
		}
		if(t.length()==c+1) System.out.println("Yes");
		else System.out.println("No");

	}

}
