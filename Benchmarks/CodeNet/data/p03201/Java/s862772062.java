import java.util.*;

// Do not use int, use long!!

public class Main {
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			System.out.println(0);
			sc.close();
		}
	
		public static boolean nibeki(int a, int b) {
			int c = a+b;
			while (c%2 == 0) {
				c = c/2;
			}
			if (c == 1) {
				return true;
			} else {
				return false;
			}
		}

}