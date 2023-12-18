import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        if(str.equals("575")) {
        	System.out.println("YES");
        }else if(str.equals("557")){
        	System.out.println("YES");
        }else if(str.equals("755")) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
	}
}