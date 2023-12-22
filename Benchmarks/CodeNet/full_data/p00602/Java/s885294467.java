import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			final int V = sc.nextInt();
			final int D = sc.nextInt();
			
			if(V == 0 && D == 0){
				break;
			}
			
			long fibs[] = new long[V+1];
			
			fibs[0] = 1;
			fibs[1] = 2;
			for(int i = 2; i <= V; i++){
				fibs[i] = fibs[i-1] + fibs[i-2];
			}
			
			for(int i = 1; i <= V; i++){
				fibs[i] %= 1001;
			}
			
			Arrays.sort(fibs);
			
			int count = 0;
			
			for(int i = 1; i <= V; i ++){
				if(i != 1 && fibs[i-1] + D <= fibs[i]){
					count++;
				}
				
				
				//System.out.println(count + " " + fibs[i] + " " + (fibs[i] - fibs[i-1]));
			}
			
			
			System.out.println(count + 1);
			
		}
	}

}