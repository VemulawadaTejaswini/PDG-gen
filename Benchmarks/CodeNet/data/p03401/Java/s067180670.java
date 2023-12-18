import java.util.Scanner;

class Point{
	int x;
	int y;
	int z;
	Point(int a,int b,int c){
		this.x = a;
		this.y = b;
		this.z = c;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N+2];

		for(int i = 1 ; i <= N ; i++){
			A[i] = sc.nextInt();
		}
		A[0] = 0;
		A[N+1] = 0;
		sc.close();

		long d = 0;
		for(int i = 1 ; i <= N+1 ; i++){
			d += Math.abs(A[i]-A[i-1]);
		}


		for(int i = 1 ; i <= N ; i++){
			if((A[i-1]-A[i] <= 0 && A[i]-A[i+1] <= 0) || (A[i-1]-A[i] >= 0 && A[i]-A[i+1] >= 0)){
				System.out.println(d);
			}
			else{
				int tmp = Math.abs(A[i-1]-A[i])+Math.abs(A[i+1]-A[i]);
				int dd = tmp-Math.abs(A[i+1]-A[i-1]);
				System.out.println(d-dd);
			}
		}
	}
}
