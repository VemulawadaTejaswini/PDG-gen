
class Main28 {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String buf = br.readLine();
			String[] line = buf.split(" ");
			int n = Integer.parseInt(line[0]);
			int m = Integer.parseInt(line[1]);
			int l = Integer.parseInt(line[2]);
			int[][] mat1 = new int [n][m];
			int[][] mat2 =new int [m][l];	
		
		for(int i = 0;i < n;i++){
			String[] str = buf.split(" ");
			for(int j =0;j < m;j++){
				mat1[i][j] = 0;
				int a = Integer.parseInt(str[j]);
				mat1[i][j] += a; 
			}
		}
		for(int i = 0;i < m;i++){
			String[] str = buf.split(" ");
			for(int j=0;j <l;j++){
				mat2[i][j] = 0;
				int a = Integer.parseInt(str[j]);
				mat2[i][j] +=a;
			}
		}
		
		for(int i = 0;i < n;i++){
			int a = 0;
			for(int k = 0;k < l;k++){
				for(int j = 0;j < m;j++){
					a = mat1[i][j]*mat2[j][k];
				}
			}
			System.out.println(a);
		}
	}catch(Exception e){
	} 
	}
}