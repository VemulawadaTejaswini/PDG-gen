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
	
	public static void main(String[] $){
		String v=s.next();
		for(int i=v.length();true;i--) {
			if(v.replace(v.substring(0,i),"#").matches("##.+")) {
				System.out.println(i*2);
				return;
			}
		}
	}
}
