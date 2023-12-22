import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	int [] dp;
	int max = 1000;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int [] data = new int[5];
			int a = sc.nextInt();
			int b = sc.nextInt();
			if((a|b) == 0) break;
			data[0] = a + b;
			for(int i = 1 ; i < 5; i++){
				data[i] = sc.nextInt() + sc.nextInt();
			}
			
			int max = 0;
			int ind = -1;
			for(int i = 0 ; i < 5; i++){
				if(max < data[i]){
					max = data[i];
					ind = i;
				}
			}
			System.out.println((char) (ind + 'A')  + " " + max);
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}