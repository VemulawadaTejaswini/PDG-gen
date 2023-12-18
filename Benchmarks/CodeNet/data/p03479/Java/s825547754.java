import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt() {return Integer.parseInt(s.next());}
	static long gLong() {return Long.parseLong(s.next());}

	public static void main(String[]$){
		long r=0,x=gLong(),y=gLong();
		for(;x<=y;x*=2)
			++r;
		System.out.println(r);
	}
}