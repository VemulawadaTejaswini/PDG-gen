import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		System.out.println(IntStream.range(s.nextInt(),s.nextInt()+1).filter(Main::f).count());
	}
	static boolean f(int i) {
		return (""+i).equals(new StringBuilder(""+i).reverse().toString());
	}
}