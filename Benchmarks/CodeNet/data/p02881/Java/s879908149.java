
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in) ;
		long thing = sc.nextLong();
		//System.out.println(thing*thing+thing+thing);
		//System.out.println(Integer.MAX_VALUE);
		long i = thing;
		long j = thing;
		for (long ii = 1 ; ii <= Math.pow(thing, 0.5) ; ii ++ ) {
			if (thing % ii != 0) { continue;}
			if ((ii+(thing/ii)) < i+j) {
				i=ii;j=(thing/ii);
			}
			//System.out.println(thing/ii+" "+ii);
		}
		//System.out.println(System.currentTimeMillis()-startTime);
		System.out.println(i+ j-2);
		
	}
}
