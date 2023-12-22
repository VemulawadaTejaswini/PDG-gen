import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

    private static char[][] cmap;
    private static int[] dx = {0,1,0,-1,-1,-1,+1,+1};
    private static int[] dy = {1,0,-1,0,-1,+1,+1,-1};
    private static int n;

    private static int letsGo(int x,int y,int dir)
    {
	if(cmap[y][x] == '0')
	    return 0;

	int nx = x + dx[dir],ny = y + dy[dir];
	if(!(0<=nx && nx < n && 0<=ny && ny < n))
	    return 1;

	return letsGo(nx,ny,dir)+1;
    }

      public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	while(true)
	    {
		n = Integer.parseInt(in.readLine());
		if(n == 0)
		    break;
		cmap = new char[n+1][n+1];
		for(int i=0;i<n;i++)
		    {
			String line = in.readLine();
			for(int j=0;j<line.length();j++)
			    {
				cmap[i][j] = line.charAt(j);
			    }
		    }

		int mex = 0;
		for(int i=0;i<n;i++)
		    {
			for(int j=0;j<n;j++)
			    {
				if(cmap[i][j] != '1')
				    continue;
				
				for(int k=0;k<8;k++)
				    {
					mex = Math.max(mex,letsGo(j,i,k));
				    }
			    }
		    }

		System.out.println(mex);

	    }
    }
    
}