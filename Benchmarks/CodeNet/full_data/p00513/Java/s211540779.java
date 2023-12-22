import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		final long Smax = Integer.MAX_VALUE;
		
		int count = 0;
		for(int i = 0; i < n; i++){
			final long S = sc.nextInt();
			
			boolean found = false;
			for(long x = 1; ; x++){
				if(S >= 2*(x*x + x)){
					if((S - x) % (2*x + 1) == 0){
						//System.out.println(x  + " " + S);
						found = true;
						break;
					}
				}else{
					break;
				}
			}
			
			if(!found){
				count++;
			}
		}
		
		System.out.println(count);
	}

}