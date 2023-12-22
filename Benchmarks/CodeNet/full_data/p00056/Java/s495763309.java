import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Integer> prime = new ArrayList<Integer>();
		prime.add(2); prime.add(3);
		
	outer:	for(int i = 5; i < 50000; i += 2){
			for(int j = 1; prime.get(j) <= Math.sqrt(i); j++){
				if( i%prime.get(j) == 0 ){
					continue outer;
				}
			}
			prime.add(i);			
		}
		
		List<Integer> result = new ArrayList<Integer>();
		int n;
		while( (n = stdIn.nextInt()) != 0 ){
			if( n%2 != 0 ){
				if( prime.contains(n-2) ){
					result.add(1);
				} else {
					result.add(0);
				}
			
			} else {
				int sum = 0;
				int index = 1;
				while( prime.get(index) <= n/2 ){
					if( prime.contains(n-prime.get(index)) ){
						sum++;
					}
					index++;
				}
				result.add(sum);
			}
		}
		for(Integer sum : result){
			System.out.println(sum);
		}
	}
}