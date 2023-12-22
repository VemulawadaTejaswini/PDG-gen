
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			int n=in.nextInt(),m=in.nextInt();
			if(n==0)break;
			
			LBox box=new LBox();
			boolean Data[][]=new boolean[n][m];
			
			for(int i=0;i<n;i++) {
				String str=in.next();
				char C[]=str.toCharArray();
				for(int j=0;j<m;j++) {
					Data[i][j]=(C[j]=='1')?true:false;
				}
			}
			box.Data=Data;
			
			int max=0;
			for(int i=0;i<box.Data.length;i++) {
				//box.dump();
				boolean mtrx[][]=new boolean[n][m];
				arrayClone(box.Data,mtrx);
				int cnt=0;
				
				for(int j=mtrx.length-1;j>=0;j--) {
					
					int zero=0;
					
					for(int x=0;x<mtrx[0].length;x++) {
						
						if(mtrx[j][x]) {
							for(int y=j-1;y>=0;y--) {
								if(mtrx[y][x]) {
									mtrx[y][x]=false;
									mtrx[j][x]=false;
									break;
								}
							}
						}
						
						if(!mtrx[j][x])zero++;
					}
					
					if(zero==mtrx[0].length)cnt++;
					else arrayClone(box.Data,mtrx);
					//System.out.println(cnt);
				}
				
				if(cnt>max)max=cnt;
				//System.out.println(max);
				box.rotate();
			}
			
			System.out.println(max);
		}
		
	}
	
	static void arrayClone(boolean[][] A,boolean B[][]) {
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++)B[i][j]=A[i][j];
		}
	}
}

class LBox{
	boolean Data[][];

	
	void dump() {
		for(int i=0;i<Data.length;i++) {
			for(int j=0;j<Data[i].length;j++) {
				System.out.print((Data[i][j]?1:0)+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void rotate() {
		boolean COPY[][]=new boolean[Data.length][Data[0].length];
		for(int i=1;i<Data.length;i++) {
			COPY[i-1]=Data[i];
		}
		COPY[COPY.length-1]=Data[0];
		Data=COPY;
	}
	
}

