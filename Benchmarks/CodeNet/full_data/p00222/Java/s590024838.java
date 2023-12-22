
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		//ツエツδ可トツスツテツネツスツづ個づ督づゥツつ「v2
		int MAX = 100000000;
		boolean [] prime = new boolean[MAX/2 + 1];
		for(int i=1; i <= MAX/2; i++){
			prime[i] = true;
		}
		for(int i=1; (2*i+1) * (2*i+1) <= MAX; i++){
			if(prime[i]){
				for(int j = 3*i+1; 2*j+1 <= MAX; j += 2*i+1){
					prime[j] = false;
				}
			}
		}

		int [] memo = new int[10000];
		int count = 0;
		for(int i=6; i <= MAX/2 ; i++ ){
			if(prime[i] && prime[i-1] &&prime[i-3] &&prime[i-4]){
				memo[count] = i*2+1;
				count++;
			}
		}

		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			for(int i=0;; i++){
				if(n < memo[i]){
					System.out.println(memo[i-1]);
					break;
				}
			}
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}