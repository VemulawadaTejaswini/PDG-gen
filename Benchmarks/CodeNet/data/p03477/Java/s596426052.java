import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt() {return Integer.parseInt(s.next());}
	static long gLong() {return Long.parseLong(s.next());}

	public static void main(String[]$){
		int l=gInt()+gInt(),r=gInt()+gInt();
		System.out.println(l>r?"Left":l<r?"Right":"Balanced");
	}
}