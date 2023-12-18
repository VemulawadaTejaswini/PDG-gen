import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int cou = 0;
		int ans = 0;
		int[] ten = new int[N];
		for (int i=0;i<N ;i++ ) {
			ten[i] = scan.nextInt();
		}
		for (int i=0;i<N ;i++ ) {
			int a = ten[i];
			switch(cou){
				case 0:
					if(a<=A){
						cou++;
					}
					break;
				case 1:
					if(a>=A+1 && a<=B){
						cou++;
					}else{
						cou=0;
						i--;
					}
					break;
				case 2:
				 	if(a>=B+1){
				 		ans++;
				 		cou=0;
				 	}else{
				 		cou=0;
				 		i-=2;
				 	}
				 	break;
			}
		}
		System.out.println(ans);
	}
}