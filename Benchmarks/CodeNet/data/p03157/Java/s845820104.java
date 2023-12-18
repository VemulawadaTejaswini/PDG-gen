import java.util.Scanner;

public class Main {
	static char[][] field;
	static int h;
	static int w;
	static long B=0;
	static long W=0;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		long ans=0; 

		field = new char[h][];
		for (int i = 0; i < h; i++) {
			field[i] = sc.next().toCharArray();
		}
		for(int col=0;col<h;col++) {
			for(int row=0;row<w;row++) {
				if(field[col][row]=='.') {
					serchW(col,row);
				}else if(field[col][row]=='#') {
					serchB(col,row);
				}
				ans=ans+B*W;
				B=0;
				W=0;
			}
		}
		System.out.print(ans); 
		
	}

	public static void serchB(int col, int row) {
		B++;
		field[col][row]='!';
	if(col+1<h)if(field[col+1][row]=='.') {serchW(col+1,row);}
	if(row+1<w)if(field[col][row+1]=='.') {serchW(col,row+1);}
	if(col-1>=0)if(field[col-1][row]=='.') {serchW(col-1,row);}
	if(row-1>=0)if(field[col][row-1]=='.') {serchW(col,row-1);}	
	}
	
	public static void serchW(int col, int row) {
		W++;
		field[col][row]='!';
		if(col+1<h)if(field[col+1][row]=='#') {serchB(col+1,row);}
		if(row+1<w)if(field[col][row+1]=='#') {serchB(col,row+1);}
		if(col-1>=0)if(field[col-1][row]=='#') {serchB(col-1,row);}
		if(row-1>=0)if(field[col][row-1]=='#') {serchB(col,row-1);}	
			
	}
	
}

