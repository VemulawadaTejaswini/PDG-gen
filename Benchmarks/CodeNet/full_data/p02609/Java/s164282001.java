import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		char[] list = reader.readLine().toCharArray();
		int clip = 0;
		for(int i = 0;i<n;i++){
			if(list[i]=='1') clip++;
		}
		int[][] rems = new int[2][n+1];
		ArrayList<Integer> l = new ArrayList<>();
		l.add(-1);
		l.add(1);	
      	if(clip==1)
        {
          for(int i=0;i<n;i++)
          {
            if(list[i]=='1')
              	writer.write(0+"\n");
            else
            {
              if(list[n-1]=='1')
                    writer.write(2+"\n");
                else{
                    if(i==n-1)
                        writer.write(2+"\n");
                    else
                        writer.write(1+"\n");
                    }
            }
          }
        }
      else{
		for(int i=0;i<2;i++){
			int temp = clip + l.get(i);
			for(int j = 0;j<=n;j++){
				if(temp==0){
					rems[i][j] = 0;
					continue;
				}
				if(j==0) rems[i][j] = 1%temp;
				else rems[i][j] = (rems[i][j-1]*2)%temp;
			}
		}
		int[] remlist = new int[2];
		for(int i = 0;i<2;i++){
			int temp = clip + l.get(i);
			for(int j = 0;j<n;j++){
				if(list[j]=='1'){
					remlist[i] = (remlist[i]+rems[i][n-j-1])%temp; 
				}
			}
		}
		for(int i = 0;i<n;i++){
			if(list[i]=='1'){
				if(clip==1){
					writer.write(0+"\n");
					continue;
				}
				int lp = ((remlist[0] - rems[0][n-i-1]) + (clip-1))%(clip-1);
				writer.write((1+solve(lp))+"\n"); 
			}
			else{
				int lp = (remlist[1] + rems[1][n-i-1])%(clip+1);
				writer.write((1+solve(lp))+"\n");	
			}
		}}
		writer.flush();
	}
	public static int solve(int p){
		if(p==0) return 0;
		int temp = p;
		int cnt = 0;
		while(p>0){
			if(p%2==1) cnt++;
			p=p>>1;
		}
		if(cnt==0) return 1; 
		return 1 + solve(temp%cnt);
	}
}