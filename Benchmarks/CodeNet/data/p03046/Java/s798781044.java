import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		if(m>0) {
			System.out.println(-1);
			return;
		}
		System.out.println(IntStream.range(0,1<<n).mapToObj(i->i+" "+i)
				.collect(Collectors.joining(" ")));
	}
}