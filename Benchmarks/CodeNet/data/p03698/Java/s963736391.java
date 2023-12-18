import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.next();
		boolean r = true;
		
		char b[] = a.toCharArray();
		
		for(int i=0 ; i<a.length()-1 ; i++) {
		    for(int j=0 ; j<a.length()-1 ; j++) {
		        if(b[i] == b[j]) {
		        r = false;
		        if(r == false) break;
		        }
		        else {
		            r = true;
		        }
		    }
		    if(r == false) break;
		}
		
		if(r == false) {
		    System.out.println("No");
		}
		else {
		    System.out.println("Yes");
		}
	}
}