import java.util.*;
public class Main {
	Scanner sc;

	// 整数の入力
	int n;
	int a;
	int b;
	int c;
	int d;

	// 文字列の入力
	String s;
	String[] S;
	int[] Sn;
	int sna;
	int snb;

	boolean flg = true;

	Main(){
		sc = new Scanner(System.in);

		// 整数の入力
		n = sc.nextInt();
		a = sc.nextInt()-1;
		b = sc.nextInt()-1;
		c = sc.nextInt()-1;
		d = sc.nextInt()-1;

		// 文字列の入力
		s = sc.next();
		S = s.split("");
		Sn = new int[n];
		sna = a;
		snb = b;
		Sn[sna]=1;
		Sn[snb]=1;

		int befA;
		int befB;

		if(c>d){
			while(flg&&Sn[c]==0){
				befA = sna;
				sna = move(sna);
				if(befA==sna){
					if(Sn[d]==0){
						befB = snb;
						snb = move(snb);
						if(befB==snb)flg=false;
					} else {
						flg=false;
					}
				}
			}
			while(flg&&Sn[d]==0){
				befB = snb;
				snb = move(snb);
				if(befB==snb)flg=false;
			}
		} else {
			while(flg&&Sn[d]==0){
				befB = snb;
				snb = move(snb);
				if(befB==snb){
					if(Sn[c-1]==0){
						befA = sna;
						sna = move(sna);
						if(befA==sna)flg=false;
					} else {
						flg=false;
					}
				}
			}
			while(flg&&Sn[c]==0){
				befA = sna;
				sna = move(sna);
				if(befA==sna)flg=false;
			}

		}

		// 出力
		if(flg)System.out.println("Yes");
		else System.out.println("No");

	}

	public static void main(String[] args){
		new Main();
	}

	int move(int x){
		if(x>=n-1)return x;
		if(S[x+1].equals("#")||Sn[x+1]==1){
			if(S[x+2].equals("#")||Sn[x+2]==1){
				return x;
			} else {
				Sn[x]=0;
				Sn[x+2]=1;
				return x+2;
			}
		} else {
			Sn[x]=0;
			Sn[x+1]=1;
			return x+1;
		}
	}
}