import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int min = 100001;
		int loc = 0;
		while(K>0){
			min = 100001;
			for(int i=0; i<N; i++){
				if(a[i]<min){
					loc = i;
					min = a[i];
				}
			}
			K -= b[loc];
			a[loc] = 100001;
		}
		System.out.println(min);
		sc.close();
	}

}