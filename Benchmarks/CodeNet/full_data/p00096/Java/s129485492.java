import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] pat = new int[3001];
		
		for(int i = 0; i <= 1000; ++i){
			for(int j = 0; j <= 1000; ++j){
				for(int k = 0; k <= 1000; ++k){
					pat[i+j+k]++;
				}
			}
		}
		// 1,000,000,000
		
		
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int res = 0;
			
			for(int i = 0; i <= 1000; ++i){
				for(int j = 0; j <= 3000; ++j){
					if( i+j == n ){
						res += pat[j];
					}
				}
			}
			
			System.out.println(res);
		}
	}
}