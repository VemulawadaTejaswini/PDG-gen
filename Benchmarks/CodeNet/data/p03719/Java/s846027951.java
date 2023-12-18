import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[100000];
		for(int i=0; i<100000; i++){
			a[i] = 0;
		}
		for(int i=0; i<N; i++){
			a[sc.nextInt()-1] += sc.nextInt();
		}
		int min=0;
		for(int i=0; i<N; i++){
			K-=a[i];
			if(K<0){
				min = i+1;
				break;
			}
		}
		System.out.println(min);
		sc.close();
	}

}