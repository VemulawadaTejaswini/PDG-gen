import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	static boolean[][] r;
	public static void main(String[] args){
		int N = in.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++){
			a[i] = in.nextInt();
		}
		
		int ud = 0;
		int sum = 1;
		for(int i = 1; i < N; i++){
			if(i == 0){
				
			}else if(ud == 1){
				if(a[i - 1] > a[i]){
					ud = 0;
					sum++;
				}
			}else if(ud == -1){
				if(a[i - 1] < a[i]){
					ud = 0;
					sum++;
				}
			}else{
				if(a[i - 1] < a[i]){
					ud = 1;
				}else if(a[i - 1] > a[i]){
					ud = -1;
				}
			}
		}
		System.out.println(sum);
	}
}