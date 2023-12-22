import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	int[] sosuu = new int[1000000];
	public void run() {
		calcSosuu();
		while(sc.hasNext()){
			int n = sc.nextInt();
			int p = sc.nextInt();
			if(n == -1 && p == -1) break;
			calc(n, p);
		}
	}
	public void calc(int n , int p){
		LinkedList<Integer> list = new LinkedList<Integer>();
		int t = 0;
		int t2 = 0;
		for(int i = n+1; i < 1000000; i++){
			if(sosuu[i] == 1){
				for(int j = i; j < 1000000; j++){
					if(sosuu[j] == 1){
						list.add(i + j);
						t2++;
					}
					if(t2 == p) {
						t2 = 0;
						break;
					}
				}
				t++;
			}
			if(t == p) break;
		}
		Collections.sort(list);
		System.out.println(list.get(p-1));
	}
	
	public void calcSosuu(){
		for(int i = 2; i < 1000000; i++){
			if(sosuu[i] == 0){
				sosuu[i] = 1;
				for(int j = i * 2; j < 1000000; j = j + i){
					sosuu[j] = -1;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}