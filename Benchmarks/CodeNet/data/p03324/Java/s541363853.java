import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int sum=1;
		if(D==0){
			System.out.println(N);
		}
		else if(D==1||D==2) {
			for(int i =0;i<D;i++) {
				sum=sum*100;
			}
			long ans = sum*N;
			System.out.println(ans);
		}
	}
}