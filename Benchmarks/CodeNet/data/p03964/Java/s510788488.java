import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int takahashi = 1, aoki = 1;

		for(int i=0; i<n; i++){
			int t = sc.nextInt();
			int a = sc.nextInt();

			int tmp = Math.max(takahashi/t, aoki/a);

			while(true){
				if(t*tmp<takahashi || a*tmp<aoki){
					tmp++;
				}else{
					takahashi = t*tmp;
					aoki = a*tmp;
					break;
				}
			}
		}

		System.out.println((takahashi+aoki));
	}
}