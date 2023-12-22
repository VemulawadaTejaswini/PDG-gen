import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			if((x == 0) && (y == 0)) break;
			System.out.printf("%d %d\n", Math.min(x, y), Math.max(x, y));
		}
	}
}

