import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		String v=s.next();
		System.out.println(IntStream.range(0,v.length()-2)
				.map(i->Math.abs(753-Integer.parseInt(v.substring(i,i+3))))
				.min().getAsInt());
	}
}
