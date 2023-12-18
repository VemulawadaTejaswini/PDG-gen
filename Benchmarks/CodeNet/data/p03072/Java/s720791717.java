import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String Na = scan.nextLine();

		int N = Integer.parseInt(Na);
		int[] H = new int[N];
		int count =0;

		for(int n=1;n<N;n++) {
			int a =0;
			H[n-1] = scan.nextInt();
			if(n==1) {
				count=count+1;
			}else if(n >= 2) {
				for(int i=1;i<n;i++) {
					if( H[i-1]-H[n]>0){
						a = a+1;
						break;
					}

				}
				if(a != 0) {
					count = count + 1;
				}
			}

		}
		System.out.println(count);
	}

}
