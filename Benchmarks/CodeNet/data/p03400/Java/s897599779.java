import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[100];
		int choco = 0;
		for(int i = 0;i < N;i++){
			A[i] = sc.nextInt();
			for(int j = 1;j<=D;j=j+A[i]){
				choco++;
			}
		}
		System.out.println(X+choco);
	}

}