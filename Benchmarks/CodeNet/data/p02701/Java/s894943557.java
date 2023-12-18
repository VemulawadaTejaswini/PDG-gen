
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> k = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			String s=sc.next();
			if(!(k.contains(s))) {
				k.add(s);
			}
		}
		
		System.out.println(k.size());
		
		
		
		sc.close();
	}
}
