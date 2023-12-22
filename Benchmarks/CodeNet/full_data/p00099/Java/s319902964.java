import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] points = new int[n];
		
		for(int i = 0; i < q; i++){
			int a = sc.nextInt();
			int v = sc.nextInt();
			
			points[a-1] += v;
			
			printWinner(points);
		}
	}
	
	void printWinner(int[] points){
		int l = points.length;
		int ai = 0;
		int vi = 0;
		
		for(int i = 0; i<l; i++){
			if(points[i] > vi){
				ai = i+1;
				vi = points[i];
			}
				
		}
		System.out.printf("%d %d\n", ai, vi);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}