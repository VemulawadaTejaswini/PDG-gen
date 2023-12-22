import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double a = sc.nextDouble(), sum = a;
			for(int i=1;i<10;i++) { a = (i%2==1? a*2: a/3 ); sum += a; }
			System.out.println(sum);
		}
	}
}