import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] h = new int[n];
		boolean[] res = new boolean[n];
		for(int i = 0; i < n; i++){
			h[i] = scan.nextInt();
		}
		int result = 0;
		for(int i = 0; i < m; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(h[a-1]>h[b-1]){
				res[b-1]=true;
			}else if(h[a-1]<h[b-1]){
				res[a-1]=true;
			}else if(h[a-1]==h[b-1]){
				res[a-1]=true;
				res[b-1]=true;
			}
		}
		for(int i = 0; i < n; i++){
			if(res[i]==false)result++;
		}
		System.out.println(result);
	}
}
