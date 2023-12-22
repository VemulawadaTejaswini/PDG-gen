import java.util.*;
public class Main {
	void run(){
		Scanner scan = new Scanner(System.in);
		while(true){
			int x = scan.nextInt();
			int y = scan.nextInt();
			int s = scan.nextInt();
			if ( ( x | y | s ) == 0 ) {
		        break;
		    }
			int max = 0;
			for(int j = 0; j < s; j++){
				for(int i = 0; i < s; i++){
					int sum = i * (100 + y) / 100  + j * (100 + y) / 100;
					int sum2 = i * (100 + x) / 100  + j * (100 + x) / 100;
					if(sum2 == s && sum > max) max = sum;
				}
			}
			System.out.println(max);
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}