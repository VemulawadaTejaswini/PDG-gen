import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long X = input.nextLong();
		long yokin = 100;
		int i=0;
		
		for(i=0;yokin<X;i++) {
			yokin+= (long)(yokin*0.01);
		}
		System.out.println(i);
	}
}
