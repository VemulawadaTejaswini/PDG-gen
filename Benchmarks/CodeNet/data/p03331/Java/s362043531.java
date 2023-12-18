import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		
		
		int sum = sum(1,n-1);
		for(int i = 1; i < n/2 ; i++){
			int a=  i;
			int b = n-a;
			sum = Math.min(sum(a,b), sum);
			
		}
		System.out.println(sum);
	}
	
	int sum(int a, int b){
		return d(a)+d(b);
	}
	
	int d(int i){
		int res = 0;
		for(char ch:(""+i).toCharArray()){
			res += ch - '0';
		};
		return res;
		
	}
}
