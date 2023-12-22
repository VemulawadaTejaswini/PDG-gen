import java.awt.geom.*;
import java.util.*;
public class Main {
	boolean [] isprime;
	int [] primeCount;
	int MAX = 999999;
	private void oddEratos(){
		
		isprime = new boolean[MAX + 1];
		primeCount = new int[MAX + 1];
		for(int i = 3; i <= MAX; i+=2){
			isprime[i] = true;
		}
		primeCount[1] = 1;
		for(int i = 3; i * i <= MAX; i+= 2){
			int add = 0;
			if(isprime[i]){
				add++;
				for(int j = 3 * i; j <= MAX; j+= i * 2){
					isprime[j] = false;
				}
			}
			primeCount[i] = primeCount[i-2] + add;
		}
	}

	private void doit() {
		oddEratos();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n <= 1){
				System.out.println(0);
			}
			else if(n == 2){
				System.out.println(1);
			}
			else{
				System.out.println(primeCount[((n+1) / 2 )  * 2 - 1]);
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}