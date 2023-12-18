import java.util.Scanner;
import java.util.stream.IntStream;
class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		long x=gInt(),y=gInt(),z=gInt();
		System.out.println(
				IntStream.range(0,114514)
				.filter(i->x>=y*i+z*i+z)
				.max().getAsInt()
				);
	}
}