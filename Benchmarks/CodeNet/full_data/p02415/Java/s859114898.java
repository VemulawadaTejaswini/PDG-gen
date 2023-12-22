import java.util.Scanner;

class Main{
 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		
		char[] c = str.toCharArray();
		
		for(int i=0; i<c.length; i++)
		{
			c[i] = Character.isUpperCase(c[i]) ? Character.toLowerCase(c[i]) : Character.isLowerCase(c[i]) ? Character.toUpperCase(c[i]) : c[i];
		}
		
		System.out.println(c);
		scan.close();
	}
}