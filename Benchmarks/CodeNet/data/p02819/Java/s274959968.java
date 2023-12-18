import java.util.Scanner;

public class Main {

	private static int[] prime = new int[100010];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		prime = prime();
		for(int i = 1;i < prime.length;i++){
			if(prime[i]==1 && i > X){
				System.out.println(i+1);
				return;
			}else if(prime[i]==1 && i == X){
				System.out.println(i);
				return;
			}
		}
	}

	//素数
	private static int[] prime(){
		int num = 100010;
		int[] primeList = new int[num];
		for(int i = 0;i < num;i++){
			primeList[i] = 1;
		}
		for(int i = 1;i < num;i++){
			if(primeList[i]==1){
				int p = i + 1;
				for(int j = i + p;j < num;j+=p){
					primeList[j] = 0;
				}
			}
		}
		return primeList;
	}
}