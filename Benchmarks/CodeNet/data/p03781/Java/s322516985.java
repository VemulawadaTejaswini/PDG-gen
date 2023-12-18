import java.util.Scanner;

public class Main {

	void run(){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int sum = 0;
		for(int i=1;;i++){
			sum += i;
			if(sum >= x && sum-i < x){
				System.out.println(i);
				break;
			}
			if(sum>1000000000){
				break;
			}	
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}
