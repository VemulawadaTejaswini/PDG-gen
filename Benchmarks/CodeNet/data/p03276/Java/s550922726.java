import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
		int[]a=new int[n];
		Arrays.setAll(a,i->s.nextInt());
		System.out.println(IntStream.range(0,n-k+1)
				.map(i->Math.min(Math.abs(a[i]),Math.abs(a[i]))+a[i+k-1]-a[i])
				.min().getAsInt());
	}
}
