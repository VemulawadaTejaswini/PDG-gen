
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		while(scan.hasNext())
		{
			int n,k;
			n=scan.nextInt();
			k=scan.nextInt();
			String s,s1 ;
			s=scan.next();
			char arr[]=s.toCharArray();
			char c=Character.toLowerCase(arr[k-1]);
			arr[k-1]=c;
			System.out.println(arr);
			
			
			
		}
	}

}
