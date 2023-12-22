import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt(),m=getInt();
		List<Integer>st=INS(n).boxed().collect(Collectors.toList());

		for(int k=1;k<=m;++k){
			for(int i=0;i<n-1;++i) {
				if(st.get(i)%k>st.get(i+1)%k)
					Collections.swap(st,i,i+1);
			}
		}
		
		st.forEach(System.out::println);
	}
}