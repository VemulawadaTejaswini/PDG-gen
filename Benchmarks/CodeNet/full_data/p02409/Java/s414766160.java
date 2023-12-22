import java.io.*;
import java.util.Arrays;

class Main{
	public static void main(String[] args)throws IOException{
		int[][][] dis = new int[4][3][10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0; i<cnt; i++){
			String str[] = br.readLine().split(" ");
			int in[] = parseInts(str);
			dis[in[0]-1][in[1]-1][in[2]-1] = dis[in[0]-1][in[1]-1][in[2]-1] + in[3];
		}
		for(int b=0; b<4; b++){
			for(int f=0; f<3; f++){
				for(int r=0; r<10; r++){
					System.out.print(" " + dis[b][f][r]);
				}
				System.out.println();
			}
			if(b!=3)System.out.println("####################");
		}
	}
	static int[] parseInts(String[] s){
		int[] x = new int[s.length];
		for(int i=0; i<s.length; i++){
			x[i] = Integer.parseInt(s[i]);
		}
		return x;
	}
}