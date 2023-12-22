import java.util.*;

public class Main {

	int[] cubes = new int[60];
	int[] tetras = new int[100];

	void run(){
		Scanner in = new Scanner(System.in);
		init();
		for(int n = in.nextInt(); n>0; n = in.nextInt()){
			System.out.println(solve(n));
		}
	}

	void init(){
		for(int i=0; i<60; i++) cubes[i] = i*i*i;
		for(int i=0; i<100; i++) tetras[i] = i*(i+1)*(i+2)/6;
	}

	int solve(int n){
		int ret = 0;
		for(int i=0; i<60; i++)for(int j=0; j<100; j++){
			if(cubes[i] + tetras[j] <= n && ret < cubes[i] + tetras[j]){
				ret = cubes[i] + tetras[j];
			}
		}
		return ret;
	}

	public static void main(String args[]){
		new Main().run();
	}
}