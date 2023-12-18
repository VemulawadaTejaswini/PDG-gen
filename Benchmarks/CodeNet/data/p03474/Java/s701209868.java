import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt() {return Integer.parseInt(s.next());}
	static long gLong() {return Long.parseLong(s.next());}

	public static void main(String[]$){
		int a=gInt(),b=gInt();
		String regex="(\\d){"+a+"}-(\\d){"+b+"}";
		System.out.println(s.next().matches(regex)?"Yes":"No");
	}
}