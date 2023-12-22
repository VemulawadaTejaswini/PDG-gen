import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		int a=getInt(),b=getInt();
		for(int i=getInt();i>0;--i) {
			int A=getInt(),B=getInt();
			if(Math.min(b,B)-Math.max(a,A)>0) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}