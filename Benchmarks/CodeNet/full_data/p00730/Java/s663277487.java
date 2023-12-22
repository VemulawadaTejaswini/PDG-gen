import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Piece[] pieces = new Piece[103];
		for(int i=1; i<103; i++){
			pieces[i] = new Piece();
		}

		while(true){
			int cut = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();
			if(cut==0 && w==0 && d==0) break;
			pieces[1].setValue(w, d, 1);

			int p, s, j = 2;
			for(int i=2; i<=cut+1; i++){
				p = sc.nextInt();
				s = sc.nextInt();

				s %= (pieces[p].width+pieces[p].depth);

				if(s<pieces[p].width){
					if(s*2<pieces[p].width){
						pieces[i].setValue(pieces[p].width-s, pieces[p].depth, j+1);
						pieces[p].setValue(s, pieces[p].depth, j);
					}else{
						pieces[i].setValue(s, pieces[p].depth, j+1);
						pieces[p].setValue(pieces[p].width-s, pieces[p].depth, j);
					}
				}else{
					if((s-pieces[p].width)*2<pieces[p].depth){
						pieces[i].setValue(pieces[p].width, pieces[p].width+pieces[p].depth-s, j+1);
						pieces[p].setValue(pieces[p].width, s-pieces[p].width, j);
					}else{
						pieces[i].setValue(pieces[p].width, s-pieces[p].width, j+1);
						pieces[p].setValue(pieces[p].width, pieces[p].width+pieces[p].depth-s, j);
					}
				}
				j += 2;

				Arrays.sort(pieces, 1, i+1, new Comparator<Piece>(){
					public int compare(Piece p1, Piece p2){
						return p1.identify - p2.identify;
					}
				});
			}

			Arrays.sort(pieces, 1, cut+2, new Comparator<Piece>(){
				public int compare(Piece p1, Piece p2){
					return p1.area - p2.area;
				}
			});

			for(int i=1; i<=cut+1; i++){
				System.out.print(pieces[i].area);
				if(i<=cut) System.out.print(" ");
			}
			System.out.println();
		}
	}

	static class Piece{
		int width, depth, area;
		int identify;
		void setValue(int a, int b, int c){
			width = a;
			depth = b;
			area = a*b;
			identify = c;
		}
	}
}