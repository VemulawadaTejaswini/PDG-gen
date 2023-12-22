import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	
	class C implements Comparable<C>{
		String name;
		int score;

		public C(String name, int score) {
			this.name = name;
			this.score = score;
		}

		@Override
		public int compareTo(C o) {
			if(this.score - o.score != 0) return o.score - this.score;
			return this.name.compareTo(o.name);
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			sc.nextLine();
			C [] data = new C[n];
			for(int i = 0; i < n; i++){
				String [] input = sc.nextLine().split(" ");
				int score = calc(input);
				data[i] = new C(input[0], score);
			}
			Arrays.sort(data);
			for(C now: data){
				System.out.println(now.name + " " + now.score);
			}
		}
	}

	private int calc(String[] input) {
		int [] data = new int[input.length-1];
		for(int i = 0; i < input.length-1; i++){
			data[i] = Integer.parseInt(input[i+1]);
		}
		int sum = 0;
		int ind = 0;
		for(int i = 1; i <= 10; i++){
			if(i == 10){
				int a = data[ind];
				if(a == 10){
					int b = data[ind+1];
					int c = data[ind+2];
					sum += a + b + c;
				}
				else{
					int b = data[ind + 1];
					int c = 0;
					if(a + b == 10){
						c = data[ind + 2];
					}
					sum += a + b + c;
				}
			}
			else{
				int a = data[ind];
				if(a == 10){
					sum += data[ind+1] + data[ind + 2] + 10;
					ind++;
				}
				else{
					int b = data[ind + 1];
					if(a + b == 10){
						sum += 10 + data[ind + 2];
					}
					else{
						sum += a + b;
					}
					ind += 2;
				}
			}
		}
		return sum;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}