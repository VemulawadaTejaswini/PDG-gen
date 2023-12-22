import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double X = input.nextDouble();
		double yokin = 100.0;
		int i=0;
		
		for(i=0;yokin<X;i++) {
			yokin+= (int)(yokin*0.01);
		}
		System.out.println(i);
	}
}