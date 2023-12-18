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
		
		int D = sc.nextInt();
		int N = sc.nextInt();
		int ans = 0;
		
		if(D == 0){
			if(N != 100) ans = N;
			else ans = 101;
		}else{
			if(N != 100) ans = (int)(N * Math.pow(100, D));
			else ans = (int)((N + 1) * Math.pow(100, D));
		}
		
		System.out.println(ans);
	}
}