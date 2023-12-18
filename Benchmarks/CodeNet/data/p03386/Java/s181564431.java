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
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		
		if(B - A >= 2 * K){
			for(int i = 0; i < K; i++) System.out.println(A + i);
			for(int i = 0; i < K; i++) System.out.println(B - K + 1 + i);
		}else{
			for(int i = A; i <= B; i++) System.out.println(i);
		}
	}
}