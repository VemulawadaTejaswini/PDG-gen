import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			System.out.println("3C"+((s.nextInt()-1)%39+1));
		}
	}
}