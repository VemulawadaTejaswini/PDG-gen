import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		for(int tt = 0; tt < n; tt++){
			int sum = 0;
			int count = 0;
			for(char in : sc.next().toCharArray()){
				sum += (int)(in - '0');
				count++;
			}
			
			final int times = count - 1 + sum / 10;
			
			if(times % 2 == 0){
				System.out.println("Audrey wins.");
			}else{
				System.out.println("Fabre wins.");
			}
			
		}
		
	}

}