import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		int h=getInt(),w=getInt();
		HashMap<Integer,Integer>charcount=new HashMap<>();
		REPS(h).flatMap(i->s.next().chars()).forEach(o->charcount.merge(o,1,Integer::sum));

		HashMap<Integer,Integer>cc=new HashMap<>();

		charcount.forEach((a,b)->cc.merge(b,1,Integer::sum));
		System.out.println(cc);

		if(h==1||w==1) {
//			out(Arrays.stream(cc).filter(i->i%2==1).count()<=1);
			return;
		}

	}
	private static void out(boolean b){
		System.out.println(b?"Yes":"No");
	}
}