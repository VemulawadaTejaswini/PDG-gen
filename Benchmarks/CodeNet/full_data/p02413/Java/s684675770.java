import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String b=" ",n="\n";
        String[] rc=br.readLine().split(b);
        int r=Integer.parseInt(rc[0]);
        int c=Integer.parseInt(rc[1]);
        int[][] h=new int[r][c];
        
        for(int i=0;i<r;i++){
        	String[] row=br.readLine().split(b);
        	int s=0;
        	for(int j=0;j<c;j++){
        		h[i][j]=Integer.parseInt(row[j]);
        		sb.append(h[i][j]+b);
        		s+=h[i][j];
        	}
        	sb.append(s+n);
        }
        int ts=0;
        for(int j=0;j<c;j++){
        	int s=0;
        	for(int i=0;i<r;i++){
        		s+=h[i][j];
        		ts+=h[i][j];
        	}
        	sb.append(s+b);
        }
        sb.append(ts);
        System.out.println(sb);
	}
}