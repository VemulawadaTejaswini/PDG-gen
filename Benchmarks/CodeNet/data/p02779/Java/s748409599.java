import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num[] = new int[100000000];
		
		for(int i=0;i<100000000;i++) {
			num[i]=0;
		}
		
		int judge = 1;
		for(int i=0;i<N;i++) {
			int input = sc.nextInt();
			num[input]++;
			
			if(num[input]>=2) {
				judge = 0;
			}
		}
		
		if(judge==1) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
			}
	}
}

