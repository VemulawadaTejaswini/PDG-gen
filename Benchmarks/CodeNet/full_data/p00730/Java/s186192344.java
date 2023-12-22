import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Piece[] pieces = new Piece[102];
		for(int i=0; i<102; i++){
			pieces[i] = new Piece();
		}

		while(true){
			int cut = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();
			if(cut==0 && w==0 && d==0) break;
			pieces[0].setValue(w, d);

			int p, s;
			for(int i=1; i<=cut; i++){
				p = sc.nextInt() - 1;
				s = sc.nextInt();

				s %= (pieces[p].width*2+pieces[p].depth*2);

				if(pieces[p].width>s){
					if(s*2<pieces[p].width){
						pieces[i].setValue(pieces[p].width-s, pieces[p].depth);
						pieces[p].setValue(s, pieces[p].depth);
					}else{
						pieces[i].setValue(s, pieces[p].depth);
						pieces[p].setValue(pieces[p].width-s, pieces[p].depth);
					}
				}else if(pieces[p].width+pieces[p].depth>s){
					if((s-pieces[p].width)*2<pieces[p].depth){
						pieces[i].setValue(pieces[p].width, pieces[p].width+pieces[p].depth-s);
						pieces[p].setValue(pieces[p].width, s-pieces[p].width);
					}else{
						pieces[i].setValue(pieces[p].width, s-pieces[p].width);
						pieces[p].setValue(pieces[p].width, pieces[p].width+pieces[p].depth-s);
					}
				}else if(pieces[p].width*2+pieces[p].depth>s){
					if((s-pieces[p].width-pieces[p].depth)*2<pieces[p].width){
						pieces[i].setValue(pieces[p].width*2+pieces[p].depth-s, pieces[p].depth);
						pieces[p].setValue(s-pieces[p].width-pieces[p].depth, pieces[p].depth);
					}else{
						pieces[i].setValue(s-pieces[p].width-pieces[p].depth, pieces[p].depth);
						pieces[p].setValue(pieces[p].width*2+pieces[p].depth-s, pieces[p].depth);
					}
				}else{
					if((s-pieces[p].width*2-pieces[p].depth)*2<pieces[p].depth){
						pieces[i].setValue(pieces[p].width, pieces[p].width*2+pieces[p].depth*2-s);
						pieces[p].setValue(pieces[p].width, s-pieces[p].width*2-pieces[p].depth);
					}else{
						pieces[i].setValue(pieces[p].width, s-pieces[p].width*2-pieces[p].depth);
						pieces[p].setValue(pieces[p].width, pieces[p].width*2+pieces[p].depth*2-s);
					}
				}
			}

			Arrays.sort(pieces, 0, cut+1, new Comparator<Piece>(){
				public int compare(Piece p1, Piece p2){
					return p1.area - p2.area;
				}
			});

			for(int i=0; i<=cut; i++){
				System.out.print(pieces[i].area);
				if(i<cut) System.out.print(" ");
			}
			System.out.println();
		}
	}

	static class Piece{
		int width, depth, area;
		void setValue(int a, int b){
			width = a;
			depth = b;
			area = a*b;
		}
	}
}