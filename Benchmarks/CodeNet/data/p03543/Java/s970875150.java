import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int v=gInt();
		System.out.println(v/10%111==0||v%1000%111==0?"Yes":"No");
	}
}