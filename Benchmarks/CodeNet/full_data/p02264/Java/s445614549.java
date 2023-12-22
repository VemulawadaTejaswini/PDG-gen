import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int q = sc.nextInt();
		String[] name = new String[N];
		ArrayList<Integer> time = new ArrayList<Integer>();
		int tlen = 0;
		int cnt = 0;
		int icnt = 0;
		int tmp;
		for (int i=0; i<N; i++) {
			name[i] = sc.next();
			time.add(sc.nextInt());
		}
		
		while (cnt < N) {
			if(time.get(icnt) == 0) {
			} else if (time.get(icnt) > q){
				tmp = time.get(icnt);
				tmp -= q;
				time.set(icnt, tmp);
				tlen += q;
			} else {
				tlen += time.get(icnt);
				time.set(icnt, 0);
				System.out.println(name[icnt] + " " + tlen);
				cnt++;
			}
			icnt++;
			if(icnt > N-1) icnt -= N;
		}
	}
}

