import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] f=br.readLine().split(" ");
        int n=Integer.parseInt(f[0]);
        int m=Integer.parseInt(f[1]);
        int l=Integer.parseInt(f[2]);
        String[][] A=new String[n][m];
        String[][] B=new String[m][l];
        for(int ni=0;ni<n;ni++) A[ni]=br.readLine().split(" ");
        for(int mi=0;mi<m;mi++) B[mi]=br.readLine().split(" ");
        
    	StringBuilder sb = new StringBuilder();
        for(int ni=0;ni<n;ni++){
        	for(int li=0;li<l;li++){
        		long b=0;
            	for(int mi=0;mi<m;mi++){
            		b+=Integer.parseInt(A[ni][mi])*Integer.parseInt(B[mi][li]);
            	}
            	sb.append(b);
            	if(li!=l-1) sb.append(" ");
        	}
        	sb.append("\n");
        }
    	System.out.print(sb);
	}
}