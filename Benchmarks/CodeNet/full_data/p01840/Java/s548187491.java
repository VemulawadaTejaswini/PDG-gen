import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	static IntStream REPS(int l) {
		return IntStream.range(0,l);
	}
	public static void main(String[]__){
		int n=getInt(),m=getInt(),t=getInt(),ar[]=new int[t];
		
		for(int i=0;i<n;i++) {
			int in=getInt();
			ar[in-m]++;
			if(in+m<t)
				ar[in+m]--;
		}
		Arrays.parallelPrefix(ar,Integer::sum);
		System.out.println(Arrays.stream(ar).filter(i->i==0).count());
	}
}