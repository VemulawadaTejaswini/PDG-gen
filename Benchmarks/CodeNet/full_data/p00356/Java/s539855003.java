import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		int x=getInt(),y=getInt(),g=gcd(x,y),X=x/g,Y=y/g;
		//System.out.println(g+" "+X+" "+Y);
		//System.out.println((X+Y-1)*g+1);
		System.out.println(x+y-g+1);
	}
	static int gcd(int a,int b) {
		return a%b==0?b:gcd(b,a%b);
	}
}