import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		
		for(int b = -127; b < 127; b++) {
			for(int a = b + 1; a < 127; a++) {
				
				if(Math.pow(a, 5) - Math.pow(b, 5) == X) {
					System.out.println(a + " " + b);
					return;
				}
			}
		}
    }
}
