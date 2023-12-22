import java.util.*;
public class Main {

	static int[] pos=new int[8];
	static boolean[] row=new boolean[8],
			rup=new boolean[15],
			rdown=new boolean[15];
	static boolean[][] def=new boolean[8][8];

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();

		for(int i=0;i<n;i++) {
			int r=Integer.parseInt(in.next()),c=Integer.parseInt(in.next());
			def[c][r]=true;
			row[r]=true;
			rup[c+r]=true;
			rdown[c-r+7]=true;
		}
		set(0);
	}

	static void set(int i) {
		for(int j=0;j<8;j++) {
			if(!row[j] && !rup[i+j] && !rdown[i-j+7]) {
				pos[i]=j;

				if(i==7) {
					print();
				}
				else {
					row[j]=rup[i+j]=rdown[i-j+7]=true;
					set(i+1);
					row[j]=rup[i+j]=rdown[i-j+7]=false;
				}
			}
			else if(def[i][j]){
				pos[i]=j;
				if(i==7)print();
				else set(i+1);
			}
		}
	}

	static void print() {
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++)System.out.print((pos[j]==i)? "Q":".");
			System.out.println();
		}
	}

}

