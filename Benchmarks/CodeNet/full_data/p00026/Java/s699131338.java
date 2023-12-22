import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int[][] paper = new int[14][14];
		// assume we use 14*14 cells, then finally ignore the 0 to 1 and 12 to 13
		int count=0, max=0;
		
		while((s = br.readLine())!=null && !s.isEmpty())
		{
			int x = Integer.parseInt(s.split(",")[0]);
			int y = Integer.parseInt(s.split(",")[1]);
			int size = Integer.parseInt(s.split(",")[2]);
			
			drop(x+2,y+2,size,paper); // as we use 14*14 paper(but just assumes it as 10*10)
		}
		for(int i=2; i<12; i++)
			for(int j=2; j<12; j++){
				if(paper[i][j]==0) count++;
				if(paper[i][j] > max) max = paper[i][j];
			}
		System.out.println(count);
		System.out.println(max);
	}
		
	private static void drop(int x, int y, int size, int[][] paper)
	{
		if(size==1){ 
			for(int i=x-1; i<x+2; i++) paper[y][i]++;
			for(int i=y-1; i<y+2; i++) paper[i][x]++;
			paper[y][x]--;
		} else if(size==2) {
			for(int i=x-1; i<x+2; i++)
				for(int j=y-1; j<y+2; j++)
					paper[j][i]++;
		} else {
			for(int i=x-2; i<x+3; i++) paper[y][i]++;
			for(int i=x-1; i<x+2; i++) {
				paper[y+1][i]++;
				paper[y-1][i]++;
			}
			for(int i=y-2; i<y+3; i++) paper[i][x]++;
				paper[y+1][x]--;
				paper[y-1][x]--;
				paper[y][x]--;
		}
	}
}