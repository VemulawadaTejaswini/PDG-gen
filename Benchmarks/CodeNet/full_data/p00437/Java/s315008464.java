import java.util.*;
import java.awt.geom.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if((a|b|c) == 0) break;
			int n = sc.nextInt();
			int [][] data = new int[n][4];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 4; j++){
					data[i][j] = sc.nextInt();
				}
			}
			int [] state = new int[a + b + c];
			Arrays.fill(state, 2);
			for(int i = 0; i < n; i++){
				if(data[i][3] == 1){
					for(int j = 0; j < 3; j++){
						state[data[i][j] - 1] = 1;
					}
				}
			}
			
			for(int i = 0; i < n; i++){
				int count = 0;
				for(int j = 0; j < 3; j++){
					if(state[data[i][j] - 1] != 1){
						count++;
					}
				}
				
				if(count == 1){
					for(int j = 0; j < 3; j++){
						if(state[data[i][j] - 1] == 2){
							state[data[i][j] - 1] = 0;
						}
					}
				}
			}
			for(int i = 0; i < state.length; i++){
				System.out.println(state[i]);
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