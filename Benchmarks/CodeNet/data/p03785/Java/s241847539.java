import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		int N = cin.nextInt();
		int count = 0;
		int pass = 0;
		long C = cin.nextLong();
		long K = cin.nextLong();
		boolean hasyet[] = new boolean[N];
		long tmp = 0L;
		long T[] = new long[N];

		for(int i=0;i<N;i++){
			T[i] = cin.nextLong();
		}

		Arrays.sort(T);
		Arrays.fill(hasyet, false);

		for(int j=0;j<N;j++){
			if(!hasyet[j]){
				count++;
				tmp = T[j];
				pass = 1;
				for(int k=j+1;k<N-1&&T[k]<=T[j]+K&&pass<=C;k++){
					hasyet[k] = true;
					pass++;
				}
			}
		}

		System.out.println(count);
	}
}
