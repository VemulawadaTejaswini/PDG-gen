import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] cup = {1,0,0};
		String s;
		int a,b;
		while (sc.hasNext()) {
			s = sc.next();
			a = s.charAt(0) - 65;
			b = s.charAt(2) - 65;
			swap(cup,a,b);
		}
		for (int i=0; i<3; i++) {
			if (cup[i]==1) {out.println((char)(i+65));}
		}
	}
	
	static int[] swap(int[] ar, int a, int b) {
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b] = temp;
		return ar;
	}
}
