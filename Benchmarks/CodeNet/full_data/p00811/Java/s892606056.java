import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int[] sosuu = new int[100001];
	public void run() {
		sosuuCalc();
		while(sc.hasNext()){
			int m = sc.nextInt();
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = a/b;
			if(m == 0 && a  == 0 && b == 0)break;
			else calc(m,c);
			
		}
	}
	public void sosuuCalc(){
		sosuu[0] = -1;
		sosuu[1] = -1;
		for(int i = 2; i < 100001; i++){
			if(sosuu[i] == 0){
				sosuu[i] = 1;
				for(int j = i * 2; j < 100001; j = j + i){
					sosuu[j] = -1;
				}
			}
		}
	}
	public void calc(int m, double c){
		int p = 0;
		int q = 0;
		int max = 0;
		for(int i = 0; i < m + 1; i++){
			if(sosuu[i] == 1){
				int t = (int)(i / c);
				if(t > m) t = m + 1;
				for(int j = t; j >= i; j--){
					if(sosuu[j] == 1 && i * j < m){
						if(i * j > max){
							p = i;
							q = j;
							max = i*j;
						}
						break;
					}
				}
			}
		}
		System.out.println(p + " " + q);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}