import java.util.Scanner;
class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		char[] a=s.next().toCharArray(),b=s.next().toCharArray();
		System.out.println(a[0]==b[2]&&a[1]==b[1]&&a[2]==b[0]?"YES":"NO");
	}
}