import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int ans = 0;
		int[] ten = new int[N];
		for (int i=0;i<N ;i++ ) {
			ten[i] = scan.nextInt();
		}
		for (int i=0;i<N ;i++ ) {
			int a = ten[i];
			if(a<=A){
				if(N!=i+1){i++;}else{break;}
				a = ten[i];
				if(a>=A+1 && a<=B){
					if(N!=i+1){i++;}else{break;}
					a = ten[i];
					if(a>=B+1){
						ans++;
					}else{
						i--;
					}
				}else{
					i--;
				}
			}
		}
		System.out.println(ans);
	}
}