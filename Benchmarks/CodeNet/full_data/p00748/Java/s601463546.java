import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int[] list = new int[1000000];
	public void run() {
		makeList();
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0 )break;
			else calc(n);
			
		}
	}
	public void calc(int n){
		iter(n, 0, 0);
		iter2(n, 0, 0);
		System.out.println(minSum + " " + minSumK);
		minSum = 1000000;
		minSumK = 1000000;
	}
	int minSum = 1000000;
	int minSumK = 1000000;
	public void iter(int n, int sum, int count){
		if(n == 0){
			if(sum < minSum) 
				minSum = sum;
		}
		else{
			for(int i = count; i <= n; i++){
				if(n - i < 0) break;
				else if(list[i] > 0) iter(n -i, sum + 1, i);
			}
		}
	}
	public void iter2(int n, int sumK, int count){
		if(n == 0){
			if(sumK < minSumK) 
				minSumK = sumK;
		}
		else{
			for(int i = count; i <= n; i++){
				if(n - i < 0) break;
				if(list[i] == 1) iter2(n - i, sumK + 1, i);
			}
		}
	}
	public void makeList(){
		for(int i = 1; i < 1000000; i++){
			int t = i * (i + 1) * (i + 2) / 6;
			if(t > 1000000) break;
			else if(t % 2 == 1) list[t] = 1;
			else list[t] = 2;
 		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}