import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int x = sc.nextInt();
		int debt = 100000;
		for(int i = 0; i < x; i++){
			debt *= 1.05;
			debt += 999;
			debt /= 1000;
			debt *= 1000;
		}
		System.out.println(debt);
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}