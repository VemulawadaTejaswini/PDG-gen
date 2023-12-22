import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	Scanner sc;
	public void exe(int n, int x){
		int sum = 0;
		for(int a = 1; a <= x/3; a++){
			for(int b = a + 1; b <= n; b++){
				int c = x - b - a;
				if(a < b && b < c && c <= n){
					sum = sum + 1;
				}
				else if(c < b) break;
			}
		}
		System.out.println(sum);
	}
	public void run(){
		sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();

		while(sc.hasNextInt()){
			int value = sc.nextInt();
			int value2 = sc.nextInt();
			if(value == 0 && value2 == 0){
				break;
			}
			else{
				exe(value, value2);
			}
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}