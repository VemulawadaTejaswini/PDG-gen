import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		long K = in.nextLong();
		long sum = 0;
		for(int i = 0; i < N; i++){
			int a = in.nextInt();
			int num = in.nextInt();
			sum += num;
			if(sum >= K){
				System.out.println(a);
				return;
			}
		}
	}
}
