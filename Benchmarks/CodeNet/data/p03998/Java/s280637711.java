
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		String A=sc.next();
		String B=sc.next();
		String C=sc.next();
		
		int countA=A.length();
		int countB=B.length();
		int countC=C.length();
		
		char currentChar='a';
		
		while(true) {
			if(currentChar=='a') {
				if(countA==0) {
					System.out.println('A');
					break;
				}else {
					countA--;
					currentChar=A.charAt(0);
					A=A.substring(1,A.length());
				}
				
			}else if(currentChar=='b') {
				if(countB==0) {
					System.out.println('b');
					break;
				}else {
					countB--;
					currentChar=B.charAt(0);
					B=B.substring(1,B.length());
				}
			}else if(currentChar=='c') {
				if(countC==0) {
					System.out.println('C');
					break;
				}else {
					countC--;
					currentChar=C.charAt(0);
					C=C.substring(1,C.length());
				}
			}
			
		}
		sc.close();
	}
}