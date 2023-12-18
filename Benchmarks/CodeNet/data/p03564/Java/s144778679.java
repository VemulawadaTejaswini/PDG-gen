import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int s = 1;
		
		for(int i = 0; i < N; i++){
			int s1 = 2 * s;
			int s2 = s + K;
			if(s1 < s2) s = s1;
			else s = s2;
		}
		
		System.out.println(s);
	}
}