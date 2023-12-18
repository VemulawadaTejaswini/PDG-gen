import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		String a;
		do {
			n = stdIn.nextInt();
			a = stdIn.next();
		}while(n<3||n>50||n != a.length());
		String[] b = a.split("", 0);
		int c=0;
		
			
		for(int i=0 ; i<b.length-3 ;i++) {
			if(b[i].equals("A")&&b[i+1].equals("B")&&b[i+2].equals("C")) {
			c++;
			}
		}
		System.out.println(c);
	}
	
	}
