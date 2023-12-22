import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		int MAX = 1000000;
		int[] prime = new int[MAX];

		prime[0] = prime[1] = 0;
		for(int i=0;i<MAX;i++){
			prime[i] = 1;
		}
		for(int i=0;i<1001;i++){
			if(prime[i] == 1){
				for(int j=2*i;j<MAX;j += i){
					prime[j] = 0;
				}
			}
		}


		while(sc.hasNext()){
			int number = Integer.parseInt(sc.nextLine());
			int count = 0;

			for(int i=2;i<number;i++){
				count += prime[i];
			}
			System.out.println(count);
		}
	}
}