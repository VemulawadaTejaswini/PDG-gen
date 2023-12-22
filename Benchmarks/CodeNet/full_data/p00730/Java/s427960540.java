import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<piece> cakes;
	static int ansIdx= 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			int n = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();

			if(n == 0 && w == 0 && d ==0) {
				break;
			}
//			if(ansIdx != 0) {
//				System.out.println();
//			}
//			ansIdx++;
			cakes = new ArrayList<>();

			int[] p = new int[n];
			int[] s = new int[n];
			piece initCake= new piece(w, d);
			cakes.add(initCake);

			for(int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
				s[i] = sc.nextInt();
				divide(p[i], s[i]);
			}
			List<Integer> ansList = new ArrayList<>();
			cakes.stream()
			.forEach(piece -> ansList.add(piece.size()));

			ansList.sort(null);

			StringBuilder sb = new StringBuilder();

			ansList.stream().forEach(ans -> sb.append(ans + " "));
	        sb.setLength(sb.length()-1);
	        System.out.println(sb.toString());

		}
	}

	private void addPieces(piece new1, piece new2) {

	}
	static void divide(int idx, int s) {
		piece dividedPiece = cakes.get(idx-1);
		cakes.remove(idx-1);

		piece new1;
		piece new2;

		s %= (dividedPiece.w + dividedPiece.d)*2;

		if(s < dividedPiece.w){
			//縦に切る
				new1 = new piece(s,dividedPiece.d);
				new2 = new piece(dividedPiece.w-s, dividedPiece.d);

		}else if(dividedPiece.w + dividedPiece.d < s && s < dividedPiece.w *2 + dividedPiece.d) {
			//縦に切る
			new1 = new piece(s - dividedPiece.w - dividedPiece.d,dividedPiece.d);
			new2 = new piece(dividedPiece.w * 2 + dividedPiece.d -s, dividedPiece.d);
				}
		else if (dividedPiece.w < s && s < dividedPiece.w + dividedPiece.d) {
			//横に切る
			new1 = new piece(dividedPiece.w, s-dividedPiece.w);
			new2 = new piece(dividedPiece.w, dividedPiece.d + dividedPiece.w -s);
		}else {
			//横に切る
			new1= new piece(dividedPiece.w , s- dividedPiece.w * 2 - dividedPiece.d);
			new2 = new piece(dividedPiece.w, dividedPiece.w*2 + dividedPiece.d *2 -s);
		}
		if(new1.size() < new2.size()) {
			cakes.add(new1);
			cakes.add(new2);
		}else {
			cakes.add(new2);
			cakes.add(new1);
		}
		return;
	}
}

class piece {
	int w;
	int d;

	public piece(int w, int d){
		this.w = w;
		this.d = d;
	};
	public int size() {
		return this.w*this.d;
	}
}
