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
			int n = sc.nextInt();
			int count = 0;
			for(int a = 0; a < 10; a++){
				for(int b = 0; b < 10; b++){
					for(int c = 0; c < 10; c++){
						for(int d = 0; d < 10; d++){
							if(a+b+c+d == n){
								count++;
							}
						}						
					}
				}
			}
			System.out.println(count);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}