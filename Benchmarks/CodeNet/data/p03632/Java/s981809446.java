import java.util.*;
class Main{
	static Scanner s=new Scanner(System.in);
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int[]a=new int[114];
		++a[getInt()];
		--a[getInt()];
		++a[getInt()];
		--a[getInt()];
		Arrays.parallelPrefix(a,Integer::sum);
		System.out.println(Arrays.stream(a).filter(i->i==2).count());
	}
}