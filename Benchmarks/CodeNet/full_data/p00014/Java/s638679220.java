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
			int  d = sc.nextInt();
			int sum = 0;
			for(int i = 0 ; i  < 600; i +=d){
				sum += d*i*i;
			}
			System.out.println(sum);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}