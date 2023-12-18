import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if(N == 1) System.out.println(1);
		else{
			long n1 = 2, n2 = 1, n3 = 0;
			for(int i = 1; i < N; i++){
				n3 = n2 + n1;
				n1 = n2;
				n2 = n3;
			}
			System.out.println(n3);
		}
	}
}