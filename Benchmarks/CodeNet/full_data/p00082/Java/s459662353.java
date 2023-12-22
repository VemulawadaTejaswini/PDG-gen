import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	int [] cap = {1,2,1,2,1,4,1,4};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int [] data = new int[8];
			for(int i = 0; i < 8; i++){
				data[i] = sc.nextInt();
			}
			
			int min = 1 << 24;
			int [] ans = new int[8];
			for(int i = 0; i < 8;i++){
				int count = 0;
				for(int j = 0; j < 8; j++){
					int v = data[j] - Math.min(data[j], cap[(i+j) % 8]);
					count += v;
				}
				if(count < min){
					min = count;
					for(int j = 0;j < 8; j++){
						ans[j] = cap[(i + j) % 8];
					}
				}
			}
			for(int i = 0; i < 7; i++){
				System.out.print(ans[i] + " ");
			}
			System.out.println(ans[7]);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}