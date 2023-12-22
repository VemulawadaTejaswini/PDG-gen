import java.util.*;
import static java.util.Arrays.*;
class ProblemA{
	public static void main(String[] a){
		sort(a);
		for(int i = a.length -1; i >= a.length - 3; i--) {
			System.out.println(a[i]);
		}
	}
}