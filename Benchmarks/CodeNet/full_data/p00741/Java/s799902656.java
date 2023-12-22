import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    static int w,h;
    static int m[][] = new int[55][55];
	static int dx[] = {0,0,1,1,1,-1,-1,-1};
	static int dy[] = {1,-1,0,1,-1,0,1,-1};
    
	public static void solve(int x,int y){
		m[x][y] = 0;
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx < 0 || w <= nx ||ny < 0 || h <= ny || m[nx][ny] == 0) continue;
				
				solve(nx,ny);
			}
		}
	}
	
	public static void main(String args[]){
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String s;
	      String ss[];
	      
	      try{
	    	  while(!(s = br.readLine()).equals("0 0")){
	    		  ss = s.split(" ");
	    		  w = Integer.parseInt(ss[0]);
	    		  h = Integer.parseInt(ss[1]);
	    		  for(int i = 0; i < h; i++){
	    			s = br.readLine();  
	    			ss = s.split(" ");
	    			for(int j = 0; j < w; j++){
	    				m[i][j] = Integer.parseInt(ss[j]);
	    			}
	    		  }
	    		  
	    		  int c = 0;
	    		  for(int i = 0; i < w; i++)
	    			  for(int j = 0; j < h; j++)
	    				  if(m[i][j] == 1){
	    					  solve(i,j);
	    					  c++;
	    				  }
	    		  System.out.println(c);
	    			  
	    		  
	    	  }

	      }catch(Exception e){
	    	  System.out.println("Exception :" + e);
	      }
	}
}