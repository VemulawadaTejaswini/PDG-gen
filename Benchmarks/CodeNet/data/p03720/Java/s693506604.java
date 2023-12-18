import java.util.*;


class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[2*M];
		for(int i = 0; i < 2*M; i++){
			a[i] = sc.nextInt();
		}

		int[] town = new int[N];
		for(int i = 0; i < N; i++){
			town[i] = 1;
		}
		int index = 0;
		Arrays.sort(a);
		for(int i = 0; i < 2*M - 1; i++){
			if(a[i] == a[i+1]){
				index = a[i] - 1;
				town[index]++;
			}
		}

		for(int i = 0; i < N; i++){
			System.out.println(town[i]);
		}
	}
}