import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String str = scan.nextLine();
		char[] c=str.toCharArray();
		
		for(int i=0;i<c.length;i++){
			if(c[i] >='a' && c[i]<='z')
				c[i]-='a'-'A';
			else if(c[i] >= 'A' && c[i] <= 'Z')
				c[i]+='a'-'A';
		}
		
		str=String.valueOf(c);
		
		System.out.println(str);
		
	}
}
