import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int[] B = new int[M];
		for(int i=0;i<M;i++){
			B[i] = Integer.parseInt(sc.next());
		}
		int ans = 0;
		for(int i=0;i<N;i++){
			int sum=C;
			for(int j=0;j<M;j++){
				sum += Integer.parseInt(sc.next())*B[j];
			}
			if(sum>0)ans++;
		}
		
		System.out.println(ans);
		sc.close();
	}
	

}