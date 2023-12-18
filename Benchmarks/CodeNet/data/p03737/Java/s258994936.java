import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String c=sc.next();
		String bb=(a.charAt(0)+"").toUpperCase()+(b.charAt(0)+"").toUpperCase()+(c.charAt(0)+"").toUpperCase();
		System.out.println(bb);
	}
}