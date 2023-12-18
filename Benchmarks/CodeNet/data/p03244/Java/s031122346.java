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
		
		int n = sc.nextInt();
		
		int[] rel_even = new int[100000];
		int[] rel_odd = new int[100000];
		
		for(int i = 0; i < n; i++){
			int v = sc.nextInt() - 1;
			if(i % 2 == 0) rel_odd[v]++;
			else rel_even[v]++;
		}
		
		int max_even_num1 = 0, max_even_num2 = 0, max_odd_num1 = 0, max_odd_num2 = 0;
		int max_even_index1 = 0, max_even_index2 = 0, max_odd_index1 = 0, max_odd_index2 = 0;
		
		for(int i = 0; i < 100000; i++){
			if(rel_odd[i] > max_odd_num2 && rel_odd[i] > max_odd_num1){
				max_odd_num1 = rel_odd[i];
				max_odd_index1 = i;
			}else if(rel_odd[i] > max_odd_num2 && rel_odd[i] < max_odd_num1){
				max_odd_num2 = rel_odd[i];
				max_odd_index2 = i;
			}
		}
		
		for(int i = 0; i < 100000; i++){
			if(rel_even[i] > max_even_num2 && rel_even[i] > max_even_num1){
				max_even_num1 = rel_even[i];
				max_even_index1 = i;
			}else if(rel_even[i] > max_even_num2 && rel_even[i] < max_even_num1){
				max_even_num2 = rel_even[i];
				max_even_index2 = i;
			}
		}
		
		if(max_odd_index1 != max_even_index1){
			System.out.println(n - max_even_num1 - max_odd_num1);
		}else{
			int diff1 = max_even_num1 + max_odd_num2;
			int diff2 = max_even_num2 + max_odd_num1;
			if(diff1 > diff2) System.out.println(n - diff1);
			else System.out.println(n - diff2);
		}
	}
}