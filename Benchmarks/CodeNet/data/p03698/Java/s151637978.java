import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.next();
		boolean r = true;
		
		char b[] = a.toCharArray();
		
		for(int i=0 ; i<a.length()-1 ; i++) {
		    if(b[i] == b[i+1]) {
		        r = false;
		        if(r == false) break;
		    }
		    else {
		        r = true;
		    }
		}
		
		if(r == false) {
		    System.out.println("No");
		}
		else {
		    System.out.println("Yes");
		}
	}
}