import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[] mondai = new int[N+1];
		int j=0;
		boolean[] hantei = new boolean[N];
		int nosum = 0;
		String[] kaitou = new String[M];
		int marusum = 0;
		int t = 0;
		int mon =-1;
		for(int i=0 ; i<M ; i++) {
			mondai[j] = stdIn.nextInt();
			kaitou[i] = stdIn.next();
			if(kaitou[i].equals("AC")&&mon != mondai[j]) {
				mon = mondai[j];
				hantei[j] = true;
				marusum++;
				nosum += i-t;
				j++;
				t = i;
			}
		}
		System.out.println(marusum);
		System.out.println(nosum);
	}

}
