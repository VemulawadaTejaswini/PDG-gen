import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] A = new int[cnt];
		int amari = 1;
		int yaku = 0;
		int tmp1 = 0;
		int tmp2 = 0;
		
		
		for(int i = 0;i < cnt; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		for(int i = 0;i < cnt-1; i++) {
			tmp1 = A[cnt - 1];
			tmp2 = A[cnt -i -2];
			while(amari != 0) {
				amari = tmp1 % tmp2;
				tmp1 = tmp2;
				tmp2 = amari;
			}
			if(yaku < tmp1) {
				yaku = tmp1;
			}
			amari = 1;
		}
		System.out.println(yaku);
	}

}
