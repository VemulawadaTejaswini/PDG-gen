import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	static IntStream REPS(int r){
		return IntStream.range(0,r);
	}
	static IntStream REPS(int l,int r){
		return IntStream.rangeClosed(l,r);
	}
	static IntStream INTS(int l){
		return REPS(l).map(i->getInt());
	}
	public static void main(String[]__){
		int[] in=INTS(getInt()).sorted().toArray();
		
		System.out.println(in[in.length-1]-in[0]);
	}
}
