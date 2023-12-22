import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			if(!sc.hasNextInt()){
				break;
			}
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ta = a;
			int tb = b; 
			for(;;){
				if(a==b)break;
				if(a>b){
					a-=b;
				}else{
					b-=a;
				}
				
			}
			int gcd =  a;
			int lcm = ta/a * tb;
			System.out.println(gcd + " "+lcm);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}