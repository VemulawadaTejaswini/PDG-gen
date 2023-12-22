
import java.util.*;
import java.io.*;

public class Main{
    static final Scanner sc = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
    	
    	while(true){
    		int n = sc.nextInt()+1;
    		if(n==1){
    			break;
    		}
    		int[][][] line = new int[n][10][2];
    		boolean[] judge = new boolean[n];
    		Arrays.fill(judge,false);
    		boolean ok = false;
    		int[] m = new int[n];
    		for(int i=0;i<n;i++){
    			m[i] = sc.nextInt();
    			for(int j=0;j<m[i];j++){
    				line[i][j][0] = sc.nextInt();
    				line[i][j][1] = sc.nextInt();
    			}
    		}
    		for(int i=0;i<1;i++){
    			for(int j=i+1;j<n;j++){
    				if(m[i]!=m[j]){
    					continue;
    				}
    				boolean flag = false;
    				for(int k=0;k<m[i]-1;k++){
    						int x = Math.abs(line[i][k][0]-line[i][k+1][0])+Math.abs(line[i][k][1]-line[i][k+1][1]);
    						int y = Math.abs(line[j][k][0]-line[j][k+1][0])+Math.abs(line[j][k][1]-line[j][k+1][1]);
    						if(x!=y){
    							break;
    						}
    						if(k!=0){
    							int id=-1;
                                int jd=-1;
                                if(((line[i][k-1][0]<line[i][k][0])&&(line[i][k][1]<line[i][k+1][1])) ||
                                    ((line[i][k-1][1]<line[i][k][1])&&(line[i][k][0]>line[i][k+1][0])) ||
                                    ((line[i][k-1][0]>line[i][k][0])&&(line[i][k][1]>line[i][k+1][1])) ||
                                    ((line[i][k-1][1]>line[i][k][1])&&(line[i][k][0]<line[i][k+1][0]))){
                                    id = 1;
                                }
                                else if(((line[i][k-1][0]<line[i][k][0])&&(line[i][k][0]<line[i][k+1][0])) ||
                                    ((line[i][k-1][1]<line[i][k][1])&&(line[i][k][1]<line[i][k+1][1])) ||
                                    ((line[i][k-1][0]>line[i][k][0])&&(line[i][k][0]>line[i][k+1][0])) ||
                                    ((line[i][k-1][1]>line[i][k][1])&&(line[i][k][1]>line[i][k+1][1]))){
                                    id = 3;
                                }
                                else if(((line[i][k-1][0]<line[i][k][0])&&(line[i][k][0]>line[i][k+1][0])) ||
                                    ((line[i][k-1][1]<line[i][k][1])&&(line[i][k][1]>line[i][k+1][1])) ||
                                    ((line[i][k-1][0]>line[i][k][0])&&(line[i][k][0]<line[i][k+1][0])) ||
                                    ((line[i][k-1][1]>line[i][k][1])&&(line[i][k][1]<line[i][k+1][1]))){
                                    id = 4;
                                }
                                else{
                                    id = 2;
                                }
                                 if(((line[j][k-1][0]<line[j][k][0])&&(line[j][k][1]<line[j][k+1][1])) ||
                                    ((line[j][k-1][1]<line[j][k][1])&&(line[j][k][0]>line[j][k+1][0])) ||
                                    ((line[j][k-1][0]>line[j][k][0])&&(line[j][k][1]>line[j][k+1][1])) ||
                                    ((line[j][k-1][1]>line[j][k][1])&&(line[j][k][0]<line[j][k+1][0]))){
                                    jd = 1;
                                }
                                else if(((line[j][k-1][0]<line[j][k][0])&&(line[j][k][0]<line[j][k+1][0])) ||
                                    ((line[j][k-1][1]<line[j][k][1])&&(line[j][k][1]<line[j][k+1][1])) ||
                                    ((line[j][k-1][0]>line[j][k][0])&&(line[j][k][0]>line[j][k+1][0])) ||
                                    ((line[j][k-1][1]>line[j][k][1])&&(line[j][k][1]>line[j][k+1][1]))){
                                    jd = 3;
                                }
                                else if(((line[j][k-1][0]<line[j][k][0])&&(line[j][k][0]>line[j][k+1][0])) ||
                                    ((line[j][k-1][1]<line[j][k][1])&&(line[j][k][1]>line[j][k+1][1])) ||
                                    ((line[j][k-1][0]>line[j][k][0])&&(line[j][k][0]<line[j][k+1][0])) ||
                                    ((line[j][k-1][1]>line[j][k][1])&&(line[j][k][1]<line[j][k+1][1]))){
                                    jd = 4;
                                }
                                else{
                                    jd = 2;
                                }
                                if(id!=jd){
    								break;
    							}
    						}
    						if(k==m[i]-2){
    							flag = true;
    						}
    				}
    				for(int k=0;k<m[i]-1;k++){
    						int x = Math.abs(line[i][m[i]-1-k][0]-line[i][m[i]-1-k-1][0])+Math.abs(line[i][m[i]-1-k][1]-line[i][m[i]-1-k-1][1]);
    						int y = Math.abs(line[j][k][0]-line[j][k+1][0])+Math.abs(line[j][k][1]-line[j][k+1][1]);
    						if(x!=y){
    							break;
    						}
    						if(k!=0){
                                int id=-1;
                                int jd=-1;
                                if(((line[i][m[i]-1-k+1][0]<line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][1]<line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][1]<line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][0]>line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][0]>line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][1]>line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][1]>line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][0]<line[i][m[i]-1-k-1][0]))){
                                    id = 1;
                                }
                                else if(((line[i][m[i]-1-k+1][0]<line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][0]<line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][1]<line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][1]<line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][0]>line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][0]>line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][1]>line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][1]>line[i][m[i]-1-k-1][1]))){
                                    id = 3;
                                }
                                else if(((line[i][m[i]-1-k+1][0]<line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][0]>line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][1]<line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][1]>line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][0]>line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][0]<line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][1]>line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][1]<line[i][m[i]-1-k-1][1]))){
                                    id = 4;
                                }
                                else{
                                    id = 2;
                                }
                                 if(((line[j][k-1][0]<line[j][k][0])&&(line[j][k][1]<line[j][k+1][1])) ||
                                    ((line[j][k-1][1]<line[j][k][1])&&(line[j][k][0]>line[j][k+1][0])) ||
                                    ((line[j][k-1][0]>line[j][k][0])&&(line[j][k][1]>line[j][k+1][1])) ||
                                    ((line[j][k-1][1]>line[j][k][1])&&(line[j][k][0]<line[j][k+1][0]))){
                                    jd = 1;
                                }
                                else if(((line[j][k-1][0]<line[j][k][0])&&(line[j][k][0]<line[j][k+1][0])) ||
                                    ((line[j][k-1][1]<line[j][k][1])&&(line[j][k][1]<line[j][k+1][1])) ||
                                    ((line[j][k-1][0]>line[j][k][0])&&(line[j][k][0]>line[j][k+1][0])) ||
                                    ((line[j][k-1][1]>line[j][k][1])&&(line[j][k][1]>line[j][k+1][1]))){
                                    jd = 3;
                                }
                                else if(((line[j][k-1][0]<line[j][k][0])&&(line[j][k][0]>line[j][k+1][0])) ||
                                    ((line[j][k-1][1]<line[j][k][1])&&(line[j][k][1]>line[j][k+1][1])) ||
                                    ((line[j][k-1][0]>line[j][k][0])&&(line[j][k][0]<line[j][k+1][0])) ||
                                    ((line[j][k-1][1]>line[j][k][1])&&(line[j][k][1]<line[j][k+1][1]))){
                                    jd = 4;
                                }
                                else{
                                    jd = 2;
                                }
    							if(id!=jd){
    								break;
    							}
    						}
    						if(k==m[i]-2){
    							flag = true;
    						}
    				}
    				for(int k=0;k<m[i]-1;k++){
    						int x = Math.abs(line[i][k][0]-line[i][k+1][0])+Math.abs(line[i][k][1]-line[i][k+1][1]);
    						int y = Math.abs(line[j][m[i]-1-k][0]-line[j][m[i]-1-k-1][0])+Math.abs(line[j][m[i]-1-k][1]-line[j][m[i]-1-k-1][1]);
    						if(x!=y){
    							break;
    						}
    						if(k!=0){
    							int id=-1;
                                int jd=-1;
                                if(((line[j][m[i]-1-k+1][0]<line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][1]<line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][1]<line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][0]>line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][0]>line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][1]>line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][1]>line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][0]<line[j][m[i]-1-k-1][0]))){
                                    id = 1;
                                }
                                else if(((line[j][m[i]-1-k+1][0]<line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][0]<line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][1]<line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][1]<line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][0]>line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][0]>line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][1]>line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][1]>line[j][m[i]-1-k-1][1]))){
                                    id = 3;
                                }
                                else if(((line[j][m[i]-1-k+1][0]<line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][0]>line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][1]<line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][1]>line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][0]>line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][0]<line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][1]>line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][1]<line[j][m[i]-1-k-1][1]))){
                                    id = 4;
                                }
                                else{
                                    id = 2;
                                }
                                 if(((line[i][k-1][0]<line[i][k][0])&&(line[i][k][1]<line[i][k+1][1])) ||
                                    ((line[i][k-1][1]<line[i][k][1]&&line[i][k][0]>line[i][k+1][0])) ||
                                    ((line[i][k-1][0]>line[i][k][0]&&line[i][k][1]>line[i][k+1][1])) ||
                                    ((line[i][k-1][1]>line[i][k][1]&&line[i][k][0]<line[i][k+1][0]))){
                                    jd = 1;
                                }
                                 else if(((line[i][k-1][0]<line[i][k][0])&&(line[i][k][0]<line[i][k+1][0])) ||
                                    ((line[i][k-1][1]<line[i][k][1])&&(line[i][k][1]<line[i][k+1][1])) ||
                                    ((line[i][k-1][0]>line[i][k][0])&&(line[i][k][0]>line[i][k+1][0])) ||
                                    ((line[i][k-1][1]>line[i][k][1])&&(line[i][k][1]>line[i][k+1][1]))){
                                    jd = 3;
                                }
                                else if(((line[i][k-1][0]<line[i][k][0])&&(line[i][k][0]>line[i][k+1][0])) ||
                                    ((line[i][k-1][1]<line[i][k][1])&&(line[i][k][1]>line[i][k+1][1])) ||
                                    ((line[i][k-1][0]>line[i][k][0])&&(line[i][k][0]<line[i][k+1][0])) ||
                                    ((line[i][k-1][1]>line[i][k][1])&&(line[i][k][1]<line[i][k+1][1]))){
                                    jd = 4;
                                }
                                else{
                                    jd = 2;
                                }
    							if(id!=jd){
    								break;
    							}
    						}
    						if(k==m[i]-2){
    							flag = true;
    						}
    				}
    				for(int k=m[i]-1;k>0;k--){
    						int x = Math.abs(line[i][k][0]-line[i][k-1][0])+Math.abs(line[i][k][1]-line[i][k-1][1]);
    						int y = Math.abs(line[j][k][0]-line[j][k-1][0])+Math.abs(line[j][k][1]-line[j][k-1][1]);
    						if(x!=y){
    							break;
    						}
    						if(k!=m[i]-1){
    							int id=-1;
                                int jd=-1;
                                if(((line[i][m[i]-1-k+1][0]<line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][1]<line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][1]<line[i][m[i]-1-k][1]&&line[i][m[i]-1-k][0]>line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][0]>line[i][m[i]-1-k][0]&&line[i][m[i]-1-k][1]>line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][1]>line[i][m[i]-1-k][1]&&line[i][m[i]-1-k][0]<line[i][m[i]-1-k-1][0]))){
                                    id = 1;
                                }
                                else if(((line[i][m[i]-1-k+1][0]<line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][0]<line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][1]<line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][1]<line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][0]>line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][0]>line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][1]>line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][1]>line[i][m[i]-1-k-1][1]))){
                                    id = 3;
                                }
                                else if(((line[i][m[i]-1-k+1][0]<line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][0]>line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][1]<line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][1]>line[i][m[i]-1-k-1][1])) ||
                                    ((line[i][m[i]-1-k+1][0]>line[i][m[i]-1-k][0])&&(line[i][m[i]-1-k][0]<line[i][m[i]-1-k-1][0])) ||
                                    ((line[i][m[i]-1-k+1][1]>line[i][m[i]-1-k][1])&&(line[i][m[i]-1-k][1]<line[i][m[i]-1-k-1][1]))){
                                    id = 4;
                                }
                                else{
                                    id = 2;
                                }
                                 if(((line[j][m[i]-1-k+1][0]<line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][1]<line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][1]<line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][0]>line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][0]>line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][1]>line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][1]>line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][0]<line[j][m[i]-1-k-1][0]))){
                                    jd = 1;
                                }
                                else if(((line[j][m[i]-1-k+1][0]<line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][0]<line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][1]<line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][1]<line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][0]>line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][0]>line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][1]>line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][1]>line[j][m[i]-1-k-1][1]))){
                                    jd = 3;
                                }
                                else if(((line[j][m[i]-1-k+1][0]<line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][0]>line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][1]<line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][1]>line[j][m[i]-1-k-1][1])) ||
                                    ((line[j][m[i]-1-k+1][0]>line[j][m[i]-1-k][0])&&(line[j][m[i]-1-k][0]<line[j][m[i]-1-k-1][0])) ||
                                    ((line[j][m[i]-1-k+1][1]>line[j][m[i]-1-k][1])&&(line[j][m[i]-1-k][1]<line[j][m[i]-1-k-1][1]))){
                                    jd = 4;
                                }
                                else{
                                    jd = 2;
                                }
    							if(id!=jd){
    								break;
    							}
    						}
    						if(k==m[i]-2){
    							flag = true;
    						}
    				}
    				if(flag){
    					judge[i] = true;
    					judge[j] = true;
    					ok = true;
    				}
    			}
    		}
    		if(ok){
    			for(int i=1;i<n;i++){
    				if(judge[i]){
    					out.println(i);
    				}
    			}
    			out.flush();
    		}
    		out.println("+++++");
    		out.flush();
    	}

        sc.close();
        out.close();
    }
}