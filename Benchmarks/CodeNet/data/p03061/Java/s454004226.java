import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] A = new int[cnt];
		int yaku = 0;
		int tmp1 = 0;
		int tmp2 = 0;
		int amari = 1;
		
		for(int i = 0;i < cnt;i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		for(int i = 0;i < cnt -1;i++) {
			for(int j = i + 1;j < cnt;j++) {
				while(amari != 0) {
					tmp1 = A[cnt - (i + 1)];
					tmp2 = A[cnt -(j + 1)];
					while(amari != 0) {
						amari = tmp1 % tmp2;
						tmp1 = tmp2;
						tmp2 = amari;
					}
					if(yaku < tmp1) {
						yaku = tmp1;
					}
				}
				amari = 1;
			}
		}
		System.out.println(yaku);
	}
}