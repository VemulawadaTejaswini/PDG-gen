import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long temp [] = new long[2001];
		long ans[] = new long[4001];
		for(int i = 0; i < 1001; i++){
			for(int j = 0; j < 1001; j++){
				temp[i + j]++;
			}
		}
		for(int i = 0; i < 2001; i++){
			for(int j = 0; j < 2001; j++){
				ans[i + j] += temp[i] * temp[j];
			}
		}
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(ans[n]);
		}
		
	}
}