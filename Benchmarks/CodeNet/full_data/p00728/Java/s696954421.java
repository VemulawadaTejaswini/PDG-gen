import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			
			int[] data = new int[n];
			for(int i = 0; i < n ; i++){
				data[i] = sc.nextInt();
			}
			Arrays.sort(data);
			
			int value = 0;
			for(int i = 1; i < n-1;i++){
				value += data[i];
			}
			System.out.println(value / (n-2));
		}
	}
	
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}