

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = a;
			int d = b;
			
			if(a<b){
				int tmp = b;
				b = a;
				a = tmp;
			}
			
			while(true){
				if(a%b==0){
					System.out.print(b+" ");
					break;
				}
				int tmp = a%b;
				a = b;
				b = tmp;
			}
			
			func(c,d);
			
		}
	}
	
	static void func(int a,int b){
		int ans = 1;
		int i = 2;
		
		while(a*b!=1){
			int count_a = 0;
			int count_b = 0;
			while(a%i==0){
				count_a++;
				a = a/i;
			}
			while(b%i==0){
				count_b++;
				b = b/i;
			}
			int t = Math.max(count_a, count_b);
			ans = ans*(int)Math.pow(i,Math.max(count_a, count_b));
			i++;
		}
		
		System.out.println(ans);
	}
}