import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		while(sc.hasNext()){
			int n = sc.nextInt(), sum = 0;
			for(int a = 0; a < 1000; a++){
				if(a > n)
					continue;
				
				for(int b =0; b < 1000; b++){
					if(a+b > n)
						continue;
					
					for(int c = 0; c < 1000; c++){
						if(a+b+c > n)
							continue;
						
						for(int d = 0; d < 1000; d++){
							if(a + b + c + d == n)
								sum++;
						}
					}
				}
			}
			
			System.out.println(sum);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}