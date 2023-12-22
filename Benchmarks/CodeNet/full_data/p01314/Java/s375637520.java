import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		new Main().run();
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n;
			n = sc.nextInt();
			if(n == 0){
				break;
			}
			int sum = 1;
			int i = 2;
			int count = 0;
			while(true){
				if((n - sum) < i){
					break;
				}
				if((n - sum) % i == 0){
					count++;
				}
				sum = sum + i;
				i = i + 1;
			}
			System.out.println(count);
		}
	}
}