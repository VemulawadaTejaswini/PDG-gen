import java.util.*;
import java.util.stream.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[] A){
		System.out.println(
				IntStream.range(2,11110).map(i->i*5+1)
						.filter(o->IntStream.range(2,o).noneMatch(p->o%p==0))
						.limit(gInt())
						.mapToObj(String::valueOf)
						.collect(Collectors.joining(" "))
						);
	}
}
