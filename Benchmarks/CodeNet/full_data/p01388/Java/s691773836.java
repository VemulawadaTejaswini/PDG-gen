import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);

		final char[] ch = sc.next().toCharArray();
		
		int[] count = new int[4];
		
		for(char c : ch){
			switch(c){
			case 'K':
				count[0]++;
				break;
			case 'U':
				count[1]++;
				break;
			case 'P':
				count[2]++;
				break;
			case 'C':
				count[3]++;
				break;
			}
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i : count){
			min =  Math.min(i, min);
		}
		
		System.out.println(min);
		
		
	}

}