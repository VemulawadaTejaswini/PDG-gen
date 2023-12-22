import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int w = sc.nextInt();
			if(n == 0 && w == 0)break;
			else calc(n, w);
			
		}
	}
	public void calc(int n, int w){
		int[] vs = new int[100 / w + 1];
		double maxW = 0;
		double maxH = 0;
		for(int i = 0; i < n; i++){
			int v = sc.nextInt();
			vs[v / w] += 1;
			if(maxW < v / w) maxW = v/w;
			if(vs[v / w] > maxH) maxH = vs[v / w];
		}
		double sum = 0;
		for(int i = 0; i < maxW + 1; i++){
			sum += ((maxW - i) / maxW) * (vs[i] / maxH);
		}
		System.out.println(sum + 0.01);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}