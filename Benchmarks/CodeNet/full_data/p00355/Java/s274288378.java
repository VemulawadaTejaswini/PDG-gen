import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = Integer.parseInt(in.next());
		int b = Integer.parseInt(in.next());
		int N = Integer.parseInt(in.next());
		int[] s = new int[N];
		int[] f = new int[N];
		int[] arr = new int[1002];
		int[] arr2 = new int[1002];
		int flag = 0;
		for (int i = 0; i < N; i++){
			s[i]=Integer.parseInt(in.next());
			f[i]=Integer.parseInt(in.next());
		}
		for (int i = 0; i < N; i++){
			arr[s[i]+1]++;
			arr[f[i]+1]--;
		}
		for (int i = 0; i < N; i++){
			arr2[i+1] = arr2[i] + arr[i];
		}
		for (int i = a; i <= b; i++){
			if(arr2[i] != 0)flag = 1;
		}
		System.out.println(flag);
	}
}