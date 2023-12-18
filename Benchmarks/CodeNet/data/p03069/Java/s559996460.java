import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		sc.close();
		int sum=0;
		for(int i=0;i<N-1;i++){
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			if(i!=N-i) {
				if(ch1!=ch2&&ch1=='#') {
					sum++;	
				}
			}
		}
		System.out.print(sum);
	}
}