import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		int M =scan.nextInt();
		int[] s = new int[M];
		int[] c = new int[M];
		for(int i = 0;i < M;i++) {
			s[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}
		scan.close();
		boolean dame = false;
		for(int i = 0;i < M;i++) {
			for(int ii = i+1;ii < M;ii++) {
				if(s[i] == s[ii])if(c[i] != c[ii])dame = true;
			}
		}
		int[] Ni = new int[N];//ただし左から0
		boolean[] Nb = new boolean[N];
		for(int i = 0;i < M;i++) {
			Ni[s[i]-1] = c[i];//csから書き込み
			Nb[s[i]-1] = true;//書き込まれたらtrue
		}
		if(!Nb[0])Ni[0] = 1;//一番上の桁が書き込まれていなければ1に
		for(int i = 0;i < N;i++) {
			if(Nb[i] && Ni[i] == 0)dame = true;//書き込んだのに0はdame
			if(Nb[i])break;
		}
		System.out.println();
		if(dame) {
			System.out.print(-1);
		}else {
			for(int i = 0;i < N;i++) {
				System.out.print(Ni[i]);
			}
		}
	}
}