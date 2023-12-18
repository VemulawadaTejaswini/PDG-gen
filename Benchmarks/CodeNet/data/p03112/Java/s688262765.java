import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long[] s = new long[A];
		for(int i = 0; i < A; i++) s[i] = sc.nextLong();
		long[] t = new long[B];
		for(int i = 0; i < B; i++) t[i] = sc.nextLong();
		long[] x = new long[Q];
		for(int i = 0; i < Q; i++) x[i] = sc.nextLong();
		long toshrine;
		long shrinetotemple;
		long totemple;
		long templetoshrine;
		long distance = 0;
		int shrine = 0;
		int temple = 0;
		long answer = 0;
		for(int i = 0; i < Q; i++) {
			if(x[i]-s[0] > 0) toshrine = x[i]-s[0];
			else toshrine = s[0] - x[i];
			shrinetotemple = 999999999;
			for(int j = 0; j < A; j++) {
				distance = x[i] - s[j];
				if(distance < 0) distance *= -1;
				if(distance < toshrine) {
					toshrine = distance;
					shrine = j;
				}
			}
			for(int j = 0; j < B; j++) {
				distance = s[shrine] - t[j];
				if(distance < 0) distance *= -1;
				if(distance < shrinetotemple) {
					shrinetotemple = distance;
				}
			}
			if(x[i]-t[0] > 0) totemple = x[i]-t[0];
			else totemple = t[0]-x[i];
			templetoshrine = 999999999;
			for(int j = 0; j < B; j++) {
				distance = x[i] - t[j];
				if(distance < 0) distance *= -1;
				if(distance < totemple) {
					totemple = distance;
					temple = j;
				}
			}
			for(int j = 0; j < A; j++) {
				distance = t[temple] - s[j];
				if(distance < 0) distance *= -1;
				if(distance < templetoshrine) {
					templetoshrine = distance;
				}
			}
			if(toshrine + shrinetotemple <= totemple + templetoshrine) answer = toshrine + shrinetotemple;
			else answer = totemple + templetoshrine;
			System.out.println(answer);
		}
	}
}