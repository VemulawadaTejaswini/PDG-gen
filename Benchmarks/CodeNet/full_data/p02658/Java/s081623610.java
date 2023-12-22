import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long a = 1;
		int t = 0;
		try{

			for(int i=0; i<N; i++) {
				A[i] = sc.nextInt();
				a*=A[i];
			}

        }
        catch (Exception e){
        	t = 1;
        }
		sc.close();
		if(a == 0) {
			System.out.println(0);
		}else if(t == 1){
			System.out.println(-1);
		}else {
			System.out.println(a);
		}


	}

}