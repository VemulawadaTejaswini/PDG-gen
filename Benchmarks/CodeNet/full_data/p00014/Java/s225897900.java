import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	
	
	void run(){
		while(sc.hasNext()){
			int d = sc.nextInt();
			long ans = 0;
			
			for(int x = d; x < 600; x+=d){
				ans += x*x*d;
			}
			
			System.out.println(ans);;
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}