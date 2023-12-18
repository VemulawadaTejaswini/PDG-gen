import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int[] Q = new int[N];
		boolean flg = true;
		int numbers = new int[N];
		int a = 0;
		int b = 0;
		int buf = 0;
		int ans = -1;
		for(int i = 0;i < N;i++){
			P[i] = sc.nextInt();
			numbers[i] = 1 + i;
		}
		for(int i = 0;i < N;i++){
			Q[i] = sc.nextInt();
		}
		while(flg){
			flg = false;
			for(int i = N - 1;i > 0;i--){
				buf++;
				if(Arrays.equals(P,number)){
					a = buf;
				}else if(Arrays.equals(Q,number)){
					b = buf;
				}
				if(numbers[i] > numbers[i - 1]){
					swap(numbers,i,i - 1);
					flg = true;
				}
			}
		}
		ans = Math.abs(a - b);
		System.out.println(ans);
	}
	public static void swap(int[] a,int i,int j){
		int buf = a[i];
		a[i] = a[j];
		a[j] = a[i];
	}
}