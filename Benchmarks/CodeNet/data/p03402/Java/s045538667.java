import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		sc.close();
		char field[][] = new char[100][100];
		

		char white = '.';
		char black = '#';
		
		if(A>B){
			int tmp = A;
			A = B;
			B = tmp;
			white = '#';
			black = '.';
		}
		//ここからはA(=w)の方が小さい
		

		int white_cnt = 0, black_cnt = 0;
		int h=0; int w = 0;
		while(white_cnt<A-1) {
			if((h%2==0&&w%2==0)||(h%2==1&&w%2==1)) {
				field[h][w]=white;
				white_cnt++;
			}else {
				field[h][w]=black;
				black_cnt++;
			}
			if(w==99) {
				h++;
				w=0;
			}else w++;
		}
		
		for(int i=w;i<100;i++) {
			field[h][i]=black;
		}		
		h++;
		for(int i=0;i<100;i++) {
			field[h][i]=black;
		}
		black_cnt -= (black_cnt%50 + (49-w)/2);
		black_cnt = Math.max(0, black_cnt);
		black_cnt ++ ;
		
		h++;
		while(h<=99) {
			for(int i=0;i<100;i++) {
				field[h][i]=white;
			}
			h++;
		}
		white_cnt++;
		//もう白は作らなくてOK
		
		h = 99;
		w = 0;
		while(black_cnt<B) {
			if(w%2==0) {
				field[h][w]=black;
				black_cnt++;
			}
			if(w==99) {
				h-=2;
				w=0;
			}else w++;
		}
		System.out.println();
		
		//out
		StringBuilder sb = new StringBuilder();
		sb.append(100 + " "+ 100 + "\n");
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				sb.append(field[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
	}
}