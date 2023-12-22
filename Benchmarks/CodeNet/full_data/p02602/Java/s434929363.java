import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int[] num = new int[N];
		for(int i=0;i<N;i++){
			num[i] = scan.nextInt();
		}
		for(int i=0;i<N-A;i++){
			int p = num[i];
			int k = num[i+A];
			if(p<k){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}
