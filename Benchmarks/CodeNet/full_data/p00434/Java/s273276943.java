import java.util.*;
import java.awt.geom.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			boolean [] in = new boolean[31];
			for(int i  = 0; i < 28; i++){
				int now = sc.nextInt();
				in[now] = true;
			}
			for(int i = 1; i < 31; i++){
				if(! in[i]){
					System.out.println(i);
				}
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