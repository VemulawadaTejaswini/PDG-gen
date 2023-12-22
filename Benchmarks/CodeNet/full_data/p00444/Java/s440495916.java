import java.util.*;
import java.awt.geom.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int a = 1000 - n;
			int count = 0;
			int [] table = {500, 100, 50, 10, 5,1};
			for(int i = 0; i < table.length; i++){
				while(table[i] <= a){
					a -= table[i];
					count++;
				}
			}
			System.out.println(count);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}