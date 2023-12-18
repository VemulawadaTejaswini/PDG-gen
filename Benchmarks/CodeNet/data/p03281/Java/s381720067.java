import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		System.out.println(
				IntStream.range(1,s.nextInt()+1)
				.filter(i->i%2==1)
				.filter(i->IntStream.range(1,i+1)
						.filter(j->i%j==0)
						.count()==8)
				.count()
				);
	}
}
