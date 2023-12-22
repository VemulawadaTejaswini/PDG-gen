import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		String t=s.next();
		System.out.println(
				REPS(getInt())
				.mapToObj(i->s.next())
				.map(o->o+o)
				.filter(o->o.matches("^.*"+t+".*$"))
				.count());
	}
}