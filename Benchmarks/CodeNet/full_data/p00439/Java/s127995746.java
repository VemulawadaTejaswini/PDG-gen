import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] d = new int[n];
		for(int i = 0;i < n;i++){
			d[i] = scan.nextInt();
		}
		int sum = 0;
		int max = 0;
		for(int i = 0;i <= n-3;i++){
			sum = d[i]+d[i+1]+d[i+2];
			if(max < sum){
				max = sum;
			}
		}
		System.out.println(max);
	}
}