import java.util.stream.*;
import java.util.*;

public class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int h=s.nextInt(),w=s.nextInt(),n=s.nextInt();
		List<Integer> a=new ArrayList<>();
		IntStream.range(1,n+1).forEach(i->a.addAll(Collections.nCopies(s.nextInt(),i)));
	}
}