import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//dirichlet();
		fortune();
		
	}
	
	public static void fortune(){
		Scanner sc = new Scanner(System.in);
		int numOfData = sc.nextInt();
		for(int i = 0; i < numOfData; i++){
			int ini = sc.nextInt();
			int years = sc.nextInt();
			int num = sc.nextInt();
			int max = 0;
			for(int j = 0; j < num; j++){
				int isSev = sc.nextInt();
				double per = sc.nextDouble();
				int hand = sc.nextInt();
				int sum = ini;
				if(isSev == 1){
					for(int k = 0; k < years; k++){
						double plus = sum * per;
						int add = (int)plus;
						sum += add - hand;
					}
				}
				else{
					int save = 0;
					for(int k = 0; k < years; k++){
						//System.out.print(sum + " ");
						double plus = sum * per;
						int add = (int)plus;
						//System.out.print(add + " ");
						save += add;
						sum -= hand;
						//System.out.print(sum + " ");
						//System.out.println(add + " ");
					}
					sum += save;
					//System.out.println(sum);
					
				}
				if(max < sum){
					max = sum;
					
				}

				
			}
			System.out.println(max);
			
		}
		
	}
	
	/*public static void dirichlet(){
		//最大値は1000000
		int MAX_NUMBER = 1000001;
		
		boolean isPrime[] = new boolean[MAX_NUMBER];
		//エラトステネスの古いにかける
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2; i < MAX_NUMBER; i++){
			isPrime[i] = false;
			for(int j = 2; j < i/2; j++){
				if(i % j == 0){
					isPrime[i] = true;
					break;
				}
			}
		}
		System.out.println("END!!");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		while(a != 0 || d != 0 || n != 0){
			int sum = 0;
			int num = 0;
			sum = a;
			while(num < n){
				if(isPrime[sum]){
					num++;
				}
				sum += d;
			}
			System.out.println(sum);
			a = sc.nextInt();
			d = sc.nextInt();
			n = sc.nextInt();
		}
		
	}*/

}