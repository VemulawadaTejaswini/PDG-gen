import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		int answer = 0;
		for(int i = 0; i <= k; i++){
			for(int j = 0; j <= k; j++){
				for(int h = 0; h <= k; h++){
					if(i + j + h == s){
						answer += 1;
					}
				}
			}
		}
		
		System.out.println(answer);
	}
}