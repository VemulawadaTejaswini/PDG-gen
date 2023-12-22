import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		int dx[]={1,0,-1,0};
		int dy[]={0,1,0,-1};
		boolean visit3[][][][]=new boolean[51][51][51][51];
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int W=in.nextInt();
			int H=in.nextInt();
			if((H|W)==0)
				return;

			int map[][]=new int[H+1][W+1];
			int cnt=0;
			boolean judge=false;
			LinkedList<String>que=new LinkedList<String>();
			int tx=in.nextInt(),ty=in.nextInt();
			int kx=in.nextInt(),ky=in.nextInt();
			for(int i=1;i<=H;i++)
				for(int j=1;j<=W;j++)
					map[i][j]=in.nextInt();

			que.add(ty+" "+tx+" "+ky+" "+kx);
			while(!que.isEmpty())
			{
				int size=que.size();
				HashSet<String> HS=new HashSet<String>();
				for(int i=0;i<size;i++)
				{
					String now[]=que.poll().split(" ");
					int tnh=Integer.valueOf(now[0]);
					int tnw=Integer.valueOf(now[1]);
					int knh=Integer.valueOf(now[2]);
					int knw=Integer.valueOf(now[3]);
					
					visit3[tnh][tnw][knh][knw]=true;
					if(tnh==knh&&tnw==knw)
					{
						judge=true;
						break;
					}
					for(int j=0;j<4;j++)
					{
						int th=dy[j]+tnh;
						int tw=dx[j]+tnw;
						int kh=dy[j]*(-1)+knh;
						int kw=dx[j]*(-1)+knw;
						boolean j1=false;
						boolean j2=false;
						if(th>0&&th<=H&&tw>0&&tw<=W&&map[th][tw]!=1)
						{
							j1=true;
						}
						if(kh>0&&kh<=H&&kw>0&&kw<=W&&map[kh][kw]!=1)
						{
							j2=true;
						}
						if(j1&&j2&&!visit3[th][tw][kh][kw])
							HS.add(th+" "+tw+" "+kh+" "+kw);
						else if(!j1&&j2&&!visit3[tnh][tnw][kh][kw])
							HS.add(tnh+" "+tnw+" "+kh+" "+kw);
						else if(j1&&!j2&&!visit3[th][tw][knh][knw])
							HS.add(th+" "+tw+" "+knh+" "+knw);
					}
					
				}
				Iterator it = HS.iterator();
			  	while (it.hasNext()) 
			  		que.add(it.next().toString());
				if(judge)
					break;
				cnt++;
				if(cnt>=100)
					break;
			}
			if(!judge||cnt>=100)
				System.out.println("NA");
			else
				System.out.println(cnt);
		}
	}
}