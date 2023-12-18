import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.StringJoiner;
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
	
	public static void main(String[]$){
		ArrayDeque<Integer>b=new ArrayDeque<>();
		boolean reverse=false;
		
		int n=getInt(),ar[]=INS(n).toArray();
		for(int i:ar){
			
			if(reverse)
				b.addLast(i);
			else
				b.addFirst(i);
			
			reverse^=true;
		};
		
		
		StringJoiner sj=new StringJoiner(" ");
		if(reverse) {
			while(!b.isEmpty())
				sj.add(String.valueOf(b.pollFirst()));
		}else {
			while(!b.isEmpty())
				sj.add(String.valueOf(b.pollLast()));
		}
		System.out.println(sj);
	}
}
