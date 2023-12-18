import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	static IntStream REPS(int l,int r){
		return IntStream.rangeClosed(l,r);
	}
	static IntStream INS(int n){
		return REPS(n).map(i->getInt());
	}
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	
	public static void main(String[]__){
		int x=getInt(),a=getInt(),b=getInt();
		
		System.out.println(b-a<=0?"delicious":b-a<=x?"safe":"dangerous");
	}
}
