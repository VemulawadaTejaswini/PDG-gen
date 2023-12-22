
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int count = 0;
			for(;n!=1;){
				if(n%2 == 0){
					n /= 2;
				}else{
					n*=3;
					n+=1;
				}
				count++;
			}
			System.out.println(count);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}