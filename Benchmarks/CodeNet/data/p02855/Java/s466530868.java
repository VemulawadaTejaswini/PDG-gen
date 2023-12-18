
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		char s[][] = new char[H][W];
		int count = 1;
		int table[][] = new int[H][W];
		boolean[] row = new boolean[H];
		String line = "";
		for(int i=0;i<H;i++) {
			line = sc.next();
			for(int j=0;j<W;j++) {
				s[i][j] = line.charAt(j);
				table[i][j]=0;
			}
		}
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(s[i][j]=='#') {
					row[i] = true;
				}
			}
		}
		boolean snd = false;
		for(int i=0;i<H;i++) {
			if(row[i]) {

				for(int j=0;j<W;j++) {
					table[i][j] = count;
					if(s[i][j]=='#') {
						if(snd) {
							count++;
							table[i][j] = count;
						}
						snd = true;
					}
				}
				count++;
			}
			snd = false;
		}
		int ins1=0,ins2=0;
		for(int i=0;i<H;i++) {
			if(!row[i]) {
				for(int j=0;j<W;j++) {
					if(i!=H-1) {
						for(int k=i;k<H;k++) {
							if(row[k]) {
								ins1 = table[k][j];
								break;
							}
						}
						for(int k=i;k>=0;k--) {
							if (row[k]) {
								ins2 = table[k][j];
								break;
							}
						}
						table[i][j] = Math.max(ins1, ins2);
					}
					else {
						for(int k=i;k>=0;k--) {
							if (row[k]) {
								table[i][j] = table[k][j];
								break;
							}
						}
					}
				}
			}
		}
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println("");
		}

		out.flush();
	}

}