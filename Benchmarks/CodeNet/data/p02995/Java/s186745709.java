import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
		long c = 0;
		long A = t.nextLong();
		long B = t.nextLong();
		long C = t.nextLong();
		long D = t.nextLong();
		long i;
		for(i = A; i <= B; i++) {
			if(i%C!=0 && i%D!=0) {
				c++;
			}
			
		}System.out.println(c);

	}

}
