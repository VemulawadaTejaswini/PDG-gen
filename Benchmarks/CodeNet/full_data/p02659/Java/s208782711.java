import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = (long)(sc.nextFloat()*100f);

		long t = a*b/100;
		System.out.println(t);
	}
}