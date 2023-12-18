import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num[] = new int[200000];
		
		for(int i=0;i<200000;i++) {
			num[i]=0;
		}
		
		int judge = 1;
		for(int i=0;i<N;i++) {
			int input = sc.nextInt();
			num[i] = input;
			
			for(int j=0;j<i;j++) {
				if(num[j]==input) {
					judge = 0;
				}
			}
		}
		
		if(judge==1) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
			}
	}
}