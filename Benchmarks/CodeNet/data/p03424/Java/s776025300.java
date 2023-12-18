import java.util.*;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InputStreamReader reader = new InputStreamReader(System.in);
		int n = sc.nextInt();
		int s;
		boolean p = false;
		boolean w = false;
		boolean g = false;
		boolean y = false;
		for(int i = 0; i < n; i++) {
			try {
                s = reader.read();
                if((char)s == 'P') p = true;
                else if((char)s == 'W') w = true;
                else if((char)s == 'G') g = true;
                else if((char)s == 'Y') y = true;
			}
			catch(Exception e){
	            e.printStackTrace();
	        }
			}
		if(p == w == g == true) {
			if(y == false) System.out.println("Three");
			else System.out.println("Four");
		}
	}
}
