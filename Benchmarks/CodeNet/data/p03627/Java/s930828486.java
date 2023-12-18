import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n) {return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt();
		int[]a=new int[114514];
		INS(n).forEach(i->++a[i]);

		long r=-1;
		for(int i=100000;i>0;--i) {
			if(r==-1&&a[i]>=2) {
				a[i]-=2;
				r=i;
				++i;
				continue;
			}
			if(r!=-1&&a[i]>=2) {
				System.out.println(r*i);
				return;
			}
		}
		System.out.println(0);
	}
}