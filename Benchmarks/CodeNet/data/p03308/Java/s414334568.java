import java.util.*;
import java.util.stream.*;

public class Main{

	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		IntSummaryStatistics o=IntStream.range(0,s.nextInt()).map(i->s.nextInt()).summaryStatistics();
		System.out.println(o.getMax()-o.getMin());
	}
}