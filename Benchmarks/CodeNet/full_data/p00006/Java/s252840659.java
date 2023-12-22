import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int x;
		s=sc.nextLine();
		//System.out.println(s);
		x=s.length();
		//System.out.println(x);
		char ch[]=s.toCharArray();
		for(int i=x-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.print("\n");
			
		

	}

}