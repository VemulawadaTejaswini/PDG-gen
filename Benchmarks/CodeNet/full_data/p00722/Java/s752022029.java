import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	
	//最大値は1000000
	public static final int MAX_NUMBER = 1000000;
	
	public static void main(String[] args) {
		dirichlet();
		//fortune();
		
	}
	

	
	public static void dirichlet(){
		
		Scanner sc = new Scanner(System.in);
		
		boolean isNotPrime[] = new boolean[MAX_NUMBER];
		//System.out.println("aaa");
		//エラトステネスの古いにかける
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		isNotPrime[2] = false;
		int n1 = 0;
		for(int i = 2; i < MAX_NUMBER; i++){
			if(isNotPrime[i] == false){
				for(int j = 2; j < MAX_NUMBER / i; j++){
					isNotPrime[i * j] = true;
				}
			}
			
			if(MAX_NUMBER < i * i){
				break;
			}
			
		}
		
		/*isNotPrime[0] = false;
		isNotPrime[1] = false;
		isNotPrime[2] = true;
		int n1 = 0;
		for(int i = 3; i < MAX_NUMBER; i += 2){
			isNotPrime[i] = true;
			for(int j = 2; j <= i/2; j++){
				if(i % j == 0){
					isNotPrime[i] = false;
					n1++;
					System.out.println(n1 + " " + i);
					break;
				}
			}
		}*/
		System.out.println("END!!");
		//Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		while(a != 0 || d != 0 || n != 0){
			int sum = 0;
			int num = 0;
			sum = a;
			while(num < n){
				if(isNotPrime[sum] == false){
					num++;
				}
				sum += d;
			}
			System.out.println(sum - d);
			a = sc.nextInt();
			d = sc.nextInt();
			n = sc.nextInt();
		}
		
	}

}