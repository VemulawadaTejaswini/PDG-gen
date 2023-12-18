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
		int i=1;
		for(;true;++i) {
			l.add(i);
			if(i*(i+1)/2>n)
				break;
		}
		l.remove(Integer.valueOf(i*(i+1)/2-n));
		l.forEach(System.out::println);
	}
}