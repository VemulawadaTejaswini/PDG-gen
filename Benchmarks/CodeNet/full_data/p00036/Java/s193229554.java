import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;
		int[][] f = new int[8][8];
		int x=0,y=0;
		do{
			for(int i=0;i<8;i++){t=bf.readLine();for(int j=0;j<8;j++)f[i][j]=t.charAt(j)-48;}
			for(int i=0;i<64;i++)if(f[(int)Math.floor(i/8)][i%8]==1){y=(int)Math.floor(i/8);x=i%8;break;}
			if(y<5 && f[y+3][x]==1)	System.out.println("B");
			else if(x<5 && f[y][x+3]==1)System.out.println("C");
			else if(x>0 && y<6 && f[y+2][x-1]==1)System.out.println("D");
			else if(x<6 && y<7 && f[y+1][x+2]==1)System.out.println("E");
			else if(x<7 && y<6 && f[y+2][x+1]==1)System.out.println("F");
			else if(f[x+1][y+1]==1)System.out.println("A");
			else System.out.println("G");
		}while((t=bf.readLine())!=null);
	}
}