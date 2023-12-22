import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
 
 
public class Main{
     
	public static int sum(int[] bit, final int n, int i){
		int s = 0;
		while(i > 0){
			s += bit[i];
			i -= i & -i;
		}
		
		return s;
	}
	
	public static void add(int[] bit, final int n, int i, int x){
		while(i <= n){
			bit[i] += x;
			i += i & -i;
		}
	}
	
	public static final int MAX = 100001;
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
         
    	final int n = sc.nextInt();
    	
    	int[] bit = new int[MAX];
    	int[] array = new int[MAX];
    	
    	for(int i = 0; i < n; i++){
    		array[i] = sc.nextInt();
    		add(bit, n, array[i], array[i]);
    		//System.out.println(Arrays.toString(bit));
    	}
    	
    	
    	
    	int sum_cost = 0;
    	int prev = -1;
    	for(int i = 0; i < n; i++){
    		final int move_cost = array[i];
    		final int other_cost = sum(bit, n, move_cost - 1);
    		
    		//System.out.println(i + " " + move_cost + " " + other_cost + " ... (" + prev + " " + sum_cost +  ")");
    		
    		if(move_cost <= other_cost){
    			sum_cost += move_cost;
    		}else if(prev != -1 && move_cost < prev){
    			sum_cost += move_cost;
    		}else{
    			prev = move_cost;
    		}
    		add(bit, n, move_cost, -move_cost);
    		//System.out.println(Arrays.toString(bit));
    	}
    	
    	System.out.println(sum_cost);
         
    }
     
}