import java.util.Arrays; 
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static interface Expr{
	  	public int eval(int[] bits, int[] types);
	}
	
	public static final int AND = 0;
	public static final int OR  = 1;
	public static final int SUB = 2;
	
	public static class Node implements Expr{
		int number;
		Expr left, right;
		
		public Node(int n, Expr l, Expr r){
			number = n;
			left = l;
			right = r;
		}
		
		public int eval(int[] bits, int[] types){
			if(types[number] == AND){
				//System.out.println("And : " + (Integer.toBinaryString(left.eval(bits, types) & right.eval(bits, types))));
				return left.eval(bits, types) & right.eval(bits, types);
			}else if(types[number] == OR){
				//System.out.println("Or : " + (Integer.toBinaryString(left.eval(bits, types) | right.eval(bits, types))));
				return left.eval(bits, types) | right.eval(bits, types);
			}else if(types[number] == SUB){
				return left.eval(bits, types) ^ right.eval(bits, types);
			}else{
				return Integer.MIN_VALUE;
			}
		}
	}
	
	public static class Var implements Expr{
		int number;
		
		public Var(int n){
			number = n;
		}
		
		public int eval(int[] bits, int[] types){
			return bits[number];
		}
	}
	
	
	public static int node_number = 0;
	public static Expr parse(char[] input, int start, int end){
		if(input[start] == '('){
			int kakko_lv = 1;
			int kakko_end = -1;
			int space_pos = -1;
			
			for(int pos = start + 1; pos <= end; pos++){
				if(input[pos] == '('){
					kakko_lv++;
				}else if(input[pos] == ')'){
					kakko_lv--;
					if(kakko_lv == 0){
						kakko_end = pos;
						break;
					}
				}else if(kakko_lv == 1 && input[pos] == ' '){
					space_pos = pos;
				}
			}
			node_number++;
			return new Node(node_number - 1, parse(input, start + 1, space_pos - 1), parse(input, space_pos + 1, kakko_end - 1));
		}else{
			return new Var((int)(input[start] - '0') - 1);
		}
	}
	
	public static int dps(int nodes, int n, int deep, int[] bits, int[] types, Expr expr){
		if(nodes <= deep){
			int ret = expr.eval(bits, types);
			//System.out.println(Arrays.toString(types));
			if(ret == (1 << 4) - 1){
				return 1;
			}else{
				return 0;
			}
			
			
		}else{
			int ret = 0;
			
			for(int i = 0; i < 3; i++){
				types[deep] = i;
				//System.out.println(deep + " " + i);
				ret += dps(nodes, n, deep + 1, bits, types, expr);
			}
			
			return ret;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			node_number = 0;
			
			String input = sc.nextLine();
			if(input.equals("END")){
				break;
			}
			
			final int n = Integer.parseInt(sc.nextLine());
			
			int bits[] = new int[n];
			for(int i = 0; i < n; i++){
				String[] inputs = sc.nextLine().split(" ");
				
				int count = 0;
				for(String ins : inputs){
					int bit = Integer.parseInt(ins);
					
					bits[i] += bit << count;
					count++;
				}
			}
						
			Expr expr = parse(input.toCharArray(), 0, input.length() - 1);

			int[] types = new int[node_number];
			System.out.println(dps(node_number, n, 0, bits, types, expr));
		}
		
	}
}