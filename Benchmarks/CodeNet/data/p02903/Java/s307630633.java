import java.io.*;
import java.util.*;
import java.math.*;
     
public class Main{
	//static int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
	public static void main(String[] args) throws Exception {
    	//try{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outputStream = System.out;
        	PrintWriter out = new PrintWriter(outputStream);
     
            int i, j, u=0, v=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      
     int[][] ar = new int[n][m];
      if(a!=b && a!=0 && b!=0)
        out.print(-1);
      else
      {
        for(i=0;i<n;i++)
        {
          for(j=0;j<m;j++){
          if(i==j)
          {
            int tmp=j+a;
			for(int k=j;k<tmp;k++,j++)
				ar[i][k%m]=1;
            j--;
          }
          else
          {
            ar[i][j]=0;
          }
        }
        }
        
        for(i=0;i<n;i++)
        {
          for(j=0;j<m;j++){
          	out.print(ar[i][j]);
        	}
          out.println();
        }
      }
      out.flush();
    	out.close();
    	//}catch(Exception e){}
    	}
    }