import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int H[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			H[i] = sc.nextInt();
		}
		int ret = 0;
		for(int h : H){
			if(h >= K){
				++ret;
			}
		}
		System.out.println(ret);
	}
}
