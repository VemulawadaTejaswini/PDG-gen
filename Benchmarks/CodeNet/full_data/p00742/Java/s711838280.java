import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static void check(int[] attr, char[][] inputs){
		for(int i = 0; i < inputs.length; i++){
			for(int j = 0; j < inputs[i].length; j++){
				System.out.print(attr[inputs[i][j] - 'A']);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int dfs(int cur, int deep, int bit, int[] attr, ArrayList<Character> list, int max, char[][] inputs){
		if(cur >= deep){
			for(int i = 0; i < inputs.length; i++){
				for(int keta = inputs[i].length - 1; keta >= 0; keta--){
					if(keta != 0 && attr[inputs[i][keta] - 'A'] == 0){
						return 0;
					}else{
						break;
					}
				}
			}
			
			int keta_up = 0;
			for(int keta = 0; keta < max; keta++){
				int result = 0;
				
				for(int i = 0; i < inputs.length; i++){
					if(keta < inputs[i].length){
						result += attr[inputs[i][keta] - 'A'];
					}
				}
				
				if(inputs[inputs.length - 1].length <= keta){
					return 0;
				}else{
				
					result -= attr[inputs[inputs.length - 1][keta] - 'A'];
					result += keta_up;
				
					keta_up = result / 10;
					result %= 10;
				
					if(result != attr[inputs[inputs.length - 1][keta] - 'A']){
						return 0;
					}
				}
			}
			
			if(keta_up != 0){
				return 0;
			}
			//check(attr, inputs);
			//System.out.println(Arrays.toString(attr));
			
			return 1;
		}else{
			int count = 0;
			
			for(int number = 0; number < 10; number++){
				if((bit & (1 << number)) != 0){
					continue;
				}
				
				attr[list.get(cur) - 'A'] = number;
				count += dfs(cur + 1, deep, bit | (1 << number), attr, list, max, inputs);
			}
			
			return count;
		}
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			TreeSet<Character> set = new TreeSet<Character>();
			
			char[][] inputs = new char[n][];
			int max = Integer.MIN_VALUE;
			
			for(int i = 0; i < n; i++){
				char[] input = sc.next().toCharArray();
				
				for(char c : input){
					set.add(c);
				}
				
				inputs[i] = new char[input.length];
				
				for(int j = 0; j < input.length; j++){
					inputs[i][j] = input[input.length - j - 1];
				}
				
				max = Math.max(max, input.length);
			}
			
			ArrayList<Character> list = new ArrayList<Character>(set);
			
			System.out.println(dfs(0, list.size(), 0, new int[26], list, max, inputs));
		}
	}

}