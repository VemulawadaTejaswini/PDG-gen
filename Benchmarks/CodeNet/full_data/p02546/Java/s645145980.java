import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] $) {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		if (s.charAt(n-1)=='s') s+="es";
		else s+="s";
		System.out.println(s);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
