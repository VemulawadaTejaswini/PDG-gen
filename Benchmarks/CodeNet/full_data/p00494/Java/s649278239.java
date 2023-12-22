import java.util.Arrays; 
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] input = sc.nextLine().toCharArray();
		
		
		int j_count = 0, o_count = 0, i_count = 0;
		int stat = 0;
		
		int max = 0;
		
		for(int i = 0; i < input.length; i++){
			//System.out.println(j_count + " " + o_count + " " + i_count);
			
			switch(stat){
			case 0:
				if(input[i] == 'J'){
					j_count++;
				}else if(input[i] == 'O'){
					o_count = 1;
					stat = 1;
				}else{
					stat = 0;
					j_count = 0;
					o_count = 0;
					i_count = 0;
				}
				break;
			case 1:
				if(input[i] == 'O'){
					o_count++;
				}else if(input[i] == 'I'){
					i_count = 1;
					stat = 2;
				}else if(input[i] == 'J'){
					stat = 0;
					j_count = 1;
					o_count = 0;
					i_count = 0;
				}else{
					stat = 0;
					j_count = 0;
					o_count = 0;
					i_count = 0;
				}
				break;
			case 2:
				if(input[i] == 'I'){
					i_count++;
				}else if(input[i] == 'J'){
					stat = 0;
					if(o_count <= i_count && o_count <= j_count){
						max = Math.max(max, o_count);
					}
					j_count = 1;
					o_count = 0;
					i_count = 0;
				}else{
					stat = 0;
					if(o_count <= i_count && o_count <= j_count){
						max = Math.max(max, o_count);
					}
					j_count = 0;
					o_count = 0;
					i_count = 0;
				}
				break;
			}
		}
		
		if(o_count <= i_count && o_count <= j_count){
			max = Math.max(max, o_count);
		}
		System.out.println(max);
	}
}