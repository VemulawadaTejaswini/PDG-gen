import java.util.Scanner;

public class Main{
	public static int[] shuffle(int[] n, int x, int y){
		int[] result = new int[n.length];
		for(int i = 0; i < n.length-y; i++){
			result[i] = n[i+y];
		}
		for(int i = n.length-y; i < n.length-x; i++){
			result[i] = n[i-n.length+y+x];
		}
		for(int i = n.length-x; i < n.length; i++){
			result[i] = n[i-n.length+x];
		}
		return result;
	}
	
	public static int solve(int[] n, int p, int q, int r){
		int count = 0;
		for(int i = p-1; i < q; i++){
			if( n[i] <= r ){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] result = new int[100];
		int index = 0;
		
		int n = stdIn.nextInt();
		while( n != 0 ){
			int m = stdIn.nextInt();
			int p = stdIn.nextInt();
			int q = stdIn.nextInt();
			int r = stdIn.nextInt();
			
			int[] x = new int[m];
			int[] y = new int[m];
			for(int i = 0; i < m; i++){
				x[i] = stdIn.nextInt();
				y[i] = stdIn.nextInt();
			}
			
			int[] card = new int[n];
			for(int i = 0; i < n; i++){
				card[i] = i+1;
			}
			for(int i = 0; i < m; i++){
				card = shuffle(card, x[i], y[i]);
			}
			
		/*	for(int i = 0; i < n; i++){
				System.out.print(card[i] + " ");
			}
			System.out.println();*/
			result[index] = solve(card, p, q, r);
			index++;
			n = stdIn.nextInt();
		}
		
		for(int i = 0; i < index; i++){
			System.out.println(result[i]);
		}
	}
}