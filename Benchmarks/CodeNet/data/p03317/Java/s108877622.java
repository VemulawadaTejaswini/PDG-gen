import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
 
/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * 0.5 == 1.0/2
 * Integer.valueOf(char)はダメ、(String)
 */
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		
		int min = N + 1;
		int indexMin = 0;
		for(int i = 0; i < N; i++)
			if(A[i] < min){
				min = A[i];
				indexMin = i;
			}
		
		int left = indexMin;
		int right = N - left - 1;
		
		if(left <= right) System.out.println(calc(K, left, right));
		else System.out.println(calc(K, right, left));
	}
	
	public static int calc(int K, int left, int right){
		int numLeft = 0;
		int numRight = 0;
		
		if(numLeft == 0){
			numRight = right / (K - 1);
			if(right % (K - 1) != 0) numRight++;
			return numRight;
		}
		
		if(left + 1 <= K){
			numLeft = 1;
			right -= K - (left + 1);
		}else{
			numLeft = left / (K - 1);
			if(left % (K - 1) != 0) numLeft++;
		}
		
		if(right + 1 <= K){
				numRight = 1;
		}else{
			numRight = right / (K - 1);
			if(right % (K - 1) != 0) numRight++;
		}
		
		return numLeft + numRight;
	}
}