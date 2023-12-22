import java.util.*;

public class Main {
	public static void main(String[] args) {
		long kakeru = 1;
		Scanner sc = new Scanner(System.in);
		long first = sc.nextLong();
		for (long i = 0; i < first; i++){
			kakeru = kakeru * sc.nextLong();
			if(kakeru == 0){
				System.out.println("0");
				System.exit(0);
			}
		}
		if (kakeru > 1000000000000000000L){
			kakeru = -1;
		}
		System.out.println(kakeru);
	}
}