import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int tp = 0;
		int hp = 0;

		for(int i=0;i<x;i++) {
			String t = sc.next();
			String h = sc.next();

			if(t.equals(h)) {
				tp += 1;
				hp += 1;
			}else if(t.compareTo(h) > 0) {
				tp += 3;
			}else {
				hp += 3;
			}
		}

		System.out.println(tp + " " + hp);

		sc.close();
	}
}
