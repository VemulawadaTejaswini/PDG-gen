import java.io.*;
import java.util.StringTokenizer;

class DroppingMat {
    int mat[][] = new int[10][10];

    DroppingMat() {
	for (int i=0;i<10;i++) {
	    for (int j=0;j<10;j++) this.mat[i][j] = 0;
	}
    }

    void Drop(int x,int y) {
	if (0<=x && x<=9 && 0<=y && y<=9) this.mat[x][y]++;
    }

    void DropSmallInk(int x,int y) {
	Drop(x,y);
	Drop(x-1,y);
	Drop(x+1,y);
	Drop(x,y-1);
	Drop(x,y+1);
    }

    void DropMidiumInk(int x,int y) {
	Drop(x-1,y-1);
	Drop(x+1,y-1);
	Drop(x-1,y+1);
	Drop(x+1,y+1);
	DropSmallInk(x,y);
    }

    void DropLargeInk(int x,int y) {
	Drop(x-2,y);
	Drop(x+2,y);
	Drop(x,y-2);
	Drop(x,y+2);
	DropMidiumInk(x,y);
    }

    int NumberofZero() {
	int count = 0;
	for (int i=0;i<10;i++)
	    for (int j=0;j<10;j++)
		if (this.mat[i][j]==0) count++;
	return count;
    }

    int MaxValue() {
	int max = 0;
	for (int i=0;i<10;i++)
	    for (int j=0;j<10;j++)
		if (this.mat[i][j]>max) max = this.mat[i][j];
	return max;
    }

    //テスト用
    void PrintMat() {
	for (int i=0;i<10;i++) {
	    for (int j=0;j<10;j++) System.out.print(this.mat[i][j]+" ");
	    System.out.println(" ");
	}
    }
}

class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String buf;
	DroppingMat dm = new DroppingMat();

	try {
	    while ((buf = br.readLine())!=null) {
		StringTokenizer st = new StringTokenizer(buf,",");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int size = Integer.parseInt(st.nextToken());

	        switch (size) {
		case 1: dm.DropSmallInk(x,y); break;
		case 2: dm.DropMidiumInk(x,y); break;
		case 3: dm.DropLargeInk(x,y); break;
		}
		//dm.PrintMat();
	    }
	    System.out.println(dm.NumberofZero());
	    System.out.println(dm.MaxValue());
	} catch (Exception e) {
	    e.printStackTrace();
	}
    } 
}