import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		String str=sc.next();
		char[] c=str.toCharArray();
		for(int i=0; i<c.length; i++){
			if(Character.isUpperCase(c[i])){
				c[i]=Character.toLowerCase(c[i]);
			}
			else if(Character.isLowerCase(c[i])){
				c[i]=Character.toUpperCase(c[i]);
			}
		}
		for(int i=0;i<c.length;i++){
			System.out.printf("%c",c[i]);
		}
		System.out.println();
	}
}