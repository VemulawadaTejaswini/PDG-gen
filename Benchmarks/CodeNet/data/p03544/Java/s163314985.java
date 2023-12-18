import java.util.Scanner;
class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		long[]l=new long[87];
		l[0]=2;
		l[1]=1;
		for(int i=2;i<87;++i)
			l[i]=l[i-1]+l[i-2];
		System.out.println(l[gInt()]);
	}
}