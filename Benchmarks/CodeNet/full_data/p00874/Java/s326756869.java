import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run(){
		for(;;){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0){
				break;
			}
			
			int a[] = new int[21];
			int b[] = new int[21];
			 
			
			int sum = 0;
			for(int i = 0; i < n; i++){
				int z =  sc.nextInt();
				a[z]++;
				sum+=z;
			}
			
			for(int i = 0; i < m ; i++)
			{
				int z =  sc.nextInt();
				b[z]++;
				sum+=z;
			}
			
			for(int i = 0; i < 21;i++){
				sum -= Math.min(a[i], b[i])*i;
			}
			
			
			System.out.println(sum);
			
		}
	}
	
	public static void main(String[] a) {
		Main m = new Main();
		m.run();
	}
}