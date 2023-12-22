import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		double[][] p=new double[4][2];
		String[] d = new String[8];
		while(n-->0){
			d=bf.readLine().split(" ");
			for(int i=0;i<4;i++)for(int j=0;j<2;j++)p[i][j]=Double.parseDouble(d[i*2+j]);
			if(((p[0][1]-p[1][1])*(p[2][0]-p[3][0]))==((p[2][1]-p[3][1])*(p[0][0]-p[1][0]))){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}