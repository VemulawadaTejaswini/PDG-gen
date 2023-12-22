import java.io.*;

class Main28 {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String buf = br.readLine();
			String[] line = buf.split(" ",3);
			int n = Integer.parseInt(line[0]);
			int m = Integer.parseInt(line[1]);
			int l = Integer.parseInt(line[2]);
			int[][] mat1 = new int [n][m];
			int[][] mat2 =new int [m][l];	
		
		for(int i = 0;i < n;i++){
			buf = br.readLine();
			line = buf.split(" ",m);
			for(int j =0;j < m;j++){
				mat1[i][j] = 0;
				int a = Integer.parseInt(line[j]);
				mat1[i][j] += a; 
			}
		}
		for(int i = 0;i < m;i++){
			buf = br.readLine();
			line = buf.split(" ",l);
			for(int j=0;j <l;j++){
				mat2[i][j] = 0;
				int a = Integer.parseInt(line[j]);
				mat2[i][j] +=a;
			}
		}
		
		for(int i = 0;i < n;i++){
			for(int k = 0;k < l;k++){
				int a = 0;
				for(int j = 0;j < m;j++){
					a += mat1[i][j]*mat2[j][k];
				}
				compute(a, k, l);
			}
			System.out.print("\n");
		}
	}catch(Exception e){
	}
	}
	
		static void compute(int a,int k,int l){
		if(k != l){
			System.out.print(a+" ");
		}else {
			System.out.print(a);
		}
		}
}
				
			