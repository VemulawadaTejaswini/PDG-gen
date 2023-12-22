import java.util.*;
import java.io.*;

public class Main{
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main (String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int b[] = new int[m];
        for(int i=0;i<m;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        long psa[] = new long[n];
        psa[0] = a[0];
        int la = -1;
        if(psa[0]<=(long)k){
            la = 0;
            for(int i=1;i<n;i++){
                psa[i] = psa[i-1] + a[i];
                if(psa[i]>(long)k){
                    la = i-1;
                    break;
                }else{
                    la = i;
                }
            }
        }
        long psb[] = new long[m];
        psb[0] = b[0];
        int lb = -1;
        if(psb[0]<=(long)k){
            lb = 0;
            for(int i=1;i<m;i++){
                psb[i] = psb[i-1] + b[i];
                if(psb[i]>(long)k){
                    lb = i-1;
                    break;
                }else{
                    lb = i;
                }
            }
        }
        if(la==lb && la==-1){
            bw.write("0");
        }else{
            int ans = 0;
            int j = lb;
            for(int i=0;i<=la;i++){
                while(j>=0 && (psb[j]+psa[i])>(long)k){
                    j--;
                }
                ans = (int)Math.max(ans, i+1+j+1);
            }
            ans = (int)Math.max(ans, lb+1);
            bw.write(ans + "");
        }
		bw.flush();
	}
}
