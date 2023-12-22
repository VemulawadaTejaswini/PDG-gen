import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int a = sc.nextInt();
			System.out.println(CountPrime(a));
		}
	}
	static int CountPrime(int a){
		int n = 0;
		if(a<=1){
			return n;
		} else {
			int[] nums = new int[a+1];
			for(int i=2; i<=a ; i++){
				if(nums[i]==0){
					n++;
					for(int j=2; j*i <= a; j++){
						nums[j*i]=1;
					}
				}
			}
		}
		return n;
	}
}