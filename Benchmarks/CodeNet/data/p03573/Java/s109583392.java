import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
    /*static class Fast
    {
        BufferedReader br;
        StringTokenizer st;
 
        public Fast()
        
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }*/
    public static void main(String args[] ) throws Exception {
        //Fast in=new Fast();
        Scanner in=new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out); 
	    int n=in.nextInt(),m=in.nextInt();
	    in.nextLine();
	    char arr[][]=new char[n][m];
	    for(int i=0;i<n;i++){
	        String str=in.nextLine();
	        char[] ar=str.toCharArray();
	        for(int j=0;j<m;j++){
	            arr[i][j]=ar[j];
	        }
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            if(arr[i][j]=='#')continue;
	            else{
	                arr[i][j]=find(arr,i,j);
	            }
	        }
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            out.print(arr[i][j]);
	        }
	        out.println();
	    }
	    
	    
        out.close();
    }
    public static char find(char[][]arr,int i,int j){
        int c=0,n=arr.length,m=arr[0].length;
        if(i-1>=0 && j-1>=0 &&arr[i-1][j-1]=='#')c++;
        if(i-1>=0 && arr[i-1][j]=='#')c++;
        if(i-1>=0 && j+1<m &&arr[i-1][j+1]=='#')c++;
        if(j-1>=0 && arr[i][j-1]=='#')c++;
        if(j+1<m && arr[i][j+1]=='#')c++;
        if(i+1<n && j-1>=0 && arr[i+1][j-1]=='#')c++;
        if(i+1<n && arr[i+1][j]=='#')c++;
        if(i+1<n&&j+1<m&&arr[i+1][j+1]=='#')c++;
        return((""+c).charAt(0));
    }
}

