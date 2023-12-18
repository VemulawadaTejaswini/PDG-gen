import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int top = 0;
		int answer = 0;
		for(int i = 0; i < n; i++){
			int h = sc.nextInt();
			if(top <= h){
				top = h;
				answer += 1;
			}
		}
		System.out.println(answer);
	}
}