import java.util.*;
import java.awt.geom.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int sum1 = 0, sum2 = 0;
			for(int i = 0; i < 4; i++){
				sum1 += sc.nextInt();
			}
			for(int i = 0; i < 4; i++){
				sum2 += sc.nextInt();
			}
			if(sum1 > sum2){
				System.out.println(sum1);
			}
			else{
				System.out.println(sum2);
			}
		}
	}

	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}