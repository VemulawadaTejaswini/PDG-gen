import java.util.Scanner;

public class Main {
	int selval;
	int sumval;
	int res = 0;

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			selval = sc.nextInt();
			sumval = sc.nextInt();
			if(selval == 0 && sumval == 0)break;
			calc(0,0,selval);
			System.out.println(res++);
			res = 0;
		}
	}

	void calc(int i, int sum, int n){
		if(n == 0 && sum == sumval){
			res++;
		}

		if(i > 9)return;
		for(int k = i; k <= 9; k++){
			calc(k+1, sum+k,n-1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}