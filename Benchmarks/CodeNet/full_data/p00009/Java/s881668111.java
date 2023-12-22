import java.util.Scanner;
import java.util.Arrays;

public class Main {
	void run(){
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int input = sc.nextInt();
			boolean[] primelist = new boolean[input];
			Arrays.fill(primelist, true);
			primelist[0] = false;
			primelist[1] = false;

			for(int i = 0; i < primelist.length;i++){
				if(primelist[i]){
					//System.out.println(i);
					for(int j = i + i; j < input; j+=i){
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