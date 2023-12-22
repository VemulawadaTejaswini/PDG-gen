import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String s=sc.next();
			int JOI=0;
			int IOI=0;
			for(int i=0; i<s.length()-2; i++) {
				if(s.substring(i, i+3).equals("IOI")) {
					IOI++;
				}
				else if(s.substring(i, i+3).equals("JOI")) {
					JOI++;
				}
			}
			pl(JOI);
			pl(IOI);
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
