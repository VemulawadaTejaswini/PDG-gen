import java.util.Arrays; 
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean first = true;
		while(true){
			String input[] = sc.nextLine().split(" ");
			
			final int n = Integer.parseInt(input[0]);
			final int m = Integer.parseInt(input[1]);
			
			if(n == 0 && m == 0){
				break;
			}
			
			HashMap<String, Integer> dict = new HashMap<String, Integer>();
			int[] parent = new int[n];
			boolean[][] child = new boolean[n][n];
			
			int[] stack = new int[n];
			Arrays.fill(parent, -1);
			
			int number_count = 0;
			for(int i = 0; i < n; i++){
				String line = sc.nextLine();
				String name = line.replaceAll(" ", "");
				
				if(!dict.containsKey(name)){
					dict.put(name, number_count);
					number_count++;
				}
				
				final int cur_number = dict.get(name);
				
				int high = 0;
				while(line.charAt(high) == ' '){
					high++;
				}
				
				if(high != 0){
					parent[cur_number] = stack[high - 1];
					child[stack[high-1]][cur_number] = true;
				}
				stack[high] = cur_number;
				
				
				//System.out.println(dict);
				//System.out.println(Arrays.toString(stack));
			}
			
			for(int i = 0; i < m; i++){
				String[] inputs = sc.nextLine().split(" ");
				
				final int arg1 = dict.get(inputs[0]);
				String ops = inputs[3];
				final int arg2 = dict.get(inputs[5].substring(0, inputs[5].length() - 1));
				
				//System.out.println(arg1 + " " + ops + " " + arg2);
				
				if("child".equals(ops)){
					System.out.println(child[arg2][arg1] ? "True" : "False");
				}else if("parent".equals(ops)){
					System.out.println(parent[arg2] == arg1 ? "True" : "False");
				}else if("sibling".equals(ops)){
					final int p_num= parent[arg2];
					
					if(p_num >= 0){
						System.out.println(child[p_num][arg1] ? "True" : "False");
					}else{
						System.out.println("False");
					}
				}else if("ancestor".equals(ops)){
					int p_num = parent[arg2];
					
					while(p_num >= 0 && p_num != arg1){
						p_num = parent[p_num];
					}
					
					System.out.println(p_num >= 0 ? "True" : "False");
				}else if("descendant".equals(ops)){
					int p_num = parent[arg1];
					
					while(p_num >= 0 && p_num != arg2){
						p_num = parent[p_num];
						//System.out.println(p_num + " " + parent[p_num]);
						//sc.next();
					}
					
					System.out.println(p_num >= 0 ? "True" : "False");
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}