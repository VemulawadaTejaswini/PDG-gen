import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		String b=" ",n="\n";
        String[] rc=br.readLine().split(b);
        int r=Integer.parseInt(rc[0]);
        int c=Integer.parseInt(rc[1]);
        int[][] h=new int[r+1][c+1];
        
        for(int i=0;i<r;i++){
        	String[] row=br.readLine().split(b);
        	for(int j=0;j<c;j++){
        		h[i][j]=Integer.parseInt(row[j]);
        		h[i][c]+=h[i][j];
        		h[r][j]+=h[i][j];
        		sb1.append(h[i][j]+b);
        		if(i==r-1){
        			h[r][c]+=h[r][j];
        			sb2.append(h[r][j]+b);
        		}
        	}
        	sb1.append(h[i][c]+n);
        }
        sb1.append(sb2).append(h[r][c]);
        System.out.println(sb1);
	}
}