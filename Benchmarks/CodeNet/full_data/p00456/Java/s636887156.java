import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int w[] =new int[10];
		int k[]  =new int[10];
		for(int i = 0; i <10;i++){
			w[i] = sc.nextInt();
			
		}
		for(int j = 0; j< 10;j++){
			k[j] = sc.nextInt();
		}
		
		Arrays.sort(w);
		Arrays.sort(k);
		System.out.println((w[7]+w[8]+w[9]) + " "+(k[7]+k[8]+k[9]));
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}