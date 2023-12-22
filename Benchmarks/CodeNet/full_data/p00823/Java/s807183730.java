import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int RIGHT = Integer.MAX_VALUE;
	public static final int LEFT  = Integer.MIN_VALUE;
	
	public static boolean out = false;
	
	public static int parse(char[] input, int start, int end, HashMap<String, Integer> atoms){
		if(start > end){
			return 0;
		}
		//System.out.println(start + " " + end);
		
		if(input[start] == '('){
			int kakko_start = start;
			int kakko_lv = 1;
			int kakko_end = -1;
			
			for(int pos = start + 1; pos <= end; pos++){
				if(input[pos] == '('){
					kakko_lv++;
				}else if(input[pos] == ')'){
					kakko_lv--;
					
					if(kakko_lv == 0){
						kakko_end = pos;
						break;
					}
				}
			}
			
			int number_start = kakko_end + 1;
			int number_end = Integer.MAX_VALUE;
			int count = 0;
			for(int pos = number_start; pos <= end; pos++){
				if('0' <= input[pos] && input[pos] <= '9'){
					count *= 10;
					count += input[pos] - '0';
				}else{
					number_end = pos - 1;
					break;
				}
			}
			
			if(number_end < number_start){
				count = 1;
			}else if(number_end == Integer.MAX_VALUE){
				number_end = end;
			}
			
			if(count == 0){
				count = 1;
			}
			
			//System.out.println(kakko_start + " " + (kakko_end + 1) + " " + number_end);
			return parse(input, kakko_start + 1, kakko_end - 1, atoms) * count + parse(input, number_end + 1, end, atoms);
		}else{
			StringBuilder sb = new StringBuilder();
			
			boolean first = true;
			int atom_start = start;
			int atom_end = Integer.MAX_VALUE;
			
			for(int pos = atom_start; pos <= end; pos++){
				if(!first && 'A' <= input[pos] && input[pos] <= 'Z'){
					atom_end = pos - 1;
					break;
				}else if('A' <= input[pos] && input[pos] <= 'Z'){
					sb.append(input[pos]);
				}else if('a' <= input[pos] && input[pos] <= 'z'){
					sb.append(input[pos]);
				}else{
					atom_end = pos - 1;
					break;
				}
				
				first = false;
			}
			
			if(atom_end < atom_start){
				//
			}else if(atom_end == Integer.MAX_VALUE){
				atom_end = end;
			}
			
			//System.out.println(sb);
			
			int number_start = atom_end + 1;
			int number_end = Integer.MAX_VALUE;
			int count = 0;
			for(int pos = number_start; pos <= end; pos++){
				if('0' <= input[pos] && input[pos] <= '9'){
					count *= 10;
					count += input[pos] - '0';
				}else{
					number_end = pos - 1;
					break;
				}
			}
			
			if(number_end < number_start){
				count = 1;
				number_end = number_start - 1;
			}else if(number_end == Integer.MAX_VALUE){
				number_end = end;
			}
			
			if(count == 0){
				count = 1;
			}
			//System.out.println(number_end);
			
			if(!atoms.containsKey(sb.toString())){
				out = true;
			}
			final int cost = atoms.containsKey(sb.toString()) ? (atoms.get(sb.toString()) * count) : Integer.MIN_VALUE;
			
			return cost + parse(input, number_end + 1, end, atoms);
		}
		
	}
	
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> atoms = new HashMap<String, Integer>();
		
		boolean flag = false;
		while(true){
			String input = sc.next();
			
			if("END_OF_FIRST_PART".equals(input)){
				flag = true;
				continue;
			}
			
			//System.out.println(input);
			if(!flag){
				final int number = sc.nextInt();
			
				atoms.put(input, number);
			}else{
				if("0".equals(input)){
					break;
				}			
			
				out = false;
				int ret = parse(input.toCharArray(), 0, input.length() - 1, atoms);
				
				if(out){
					System.out.println("UNKNOWN");
				}else{
					System.out.println(ret);
				}
				
			}
		}
		
	}

}