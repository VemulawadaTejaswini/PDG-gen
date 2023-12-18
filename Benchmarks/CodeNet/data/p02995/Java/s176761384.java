import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner t = new Scanner (System.in);
		int c = 0;
		int A = t.nextInt();
		int B = t.nextInt();
		int C = t.nextInt();
		int D = t.nextInt();
		for(int i = A; i <= B; i++) {
			if(i%C!=0 && i%D!=0) {
				c++;
			}
		}System.out.println(c);
t.close();
	}

}
