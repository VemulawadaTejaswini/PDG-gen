import java.util.ArrayList;
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
		ArrayList<Integer>l=new ArrayList<>();
		for(int i=1;true;++i) {
			if(i*2+1<=n) {
				l.add(i);
				n-=i;
			}else {
				l.add(n);
				break;
			}
		}
		l.forEach(System.out::println);
	}
}