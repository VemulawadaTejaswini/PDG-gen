import java.util.Scanner;
import java.util.Arrays;

public class Main {
	void run(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int answer = 0;
			int input = sc.nextInt();
			boolean[] primelist = new boolean[input+1];
			Arrays.fill(primelist, true);
			primelist[0] = false;
			primelist[1] = false;

			for(int i = 2; i <= input;i++){
				if(primelist[i]){
					for(int j = i + i; j <= input; j+=i){
						primelist[j] = false;			
					}
					++answer;
				}
			}	
			System.out.println(answer);
		}
	}
	public static void main(String[] args) {
		new Main().run();

	}
}