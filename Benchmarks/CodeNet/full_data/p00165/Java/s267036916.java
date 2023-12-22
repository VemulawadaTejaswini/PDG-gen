import java.io.*;
import java.util.*;
import java.math.*;


public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		boolean p[] = new boolean[1000000];
		Arrays.fill(p, true);
		p[0] = false;
		p[1] = false;
		for(int i = 0; i*i < 1000000 ; i++){
			if(p[i]){
				for(int j = i+i ; j < 1000000 ; j+=i){
					p[j] = false;
				}
			}
		}
		int s[] = new int[1000000];
		s[0] = 0;
		for(int i = 1 ;i <  1000000;i++){
			if(p[i]){
				s[i] = s[i-1]+1;
			}else{
				s[i] = s[i-1];
			}
		}
		
		for(;;){
			int n = sc.nextInt();
		      
			if(n == 0){
				break;
			}
				
			int sum = 0;
			for(int i = 0; i < n ; i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				int f = Math.max(a-b-1, 0);
				int g =Math.min(a+b, 1000000-1); 
				
				sum += Math.max(0,s[g]-s[f]) - 1;
			}
			System.out.println(sum);
		}
//		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}