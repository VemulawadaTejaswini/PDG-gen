import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

    public static class Pox{
	public int t,s,d;

	Pox(){
	    t = 0;
	    s = 0;
	    d = 0;
	}

    }

      public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	while(true)
	    {
		String line = in.readLine();
		int N,M;
		N = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		M = Integer.parseInt(line.substring(line.indexOf(" ")+1));
		if(N == 0 && M == 0)
		    break;

		List<Pox> list = new ArrayList<Pox>();

		for(int i=0;i<M;i++)
		    {
			Pox input = new Pox();
			line = in.readLine();
			String[] elements = line.split(" ");
			input.t = Integer.parseInt(elements[0]);
			input.s = Integer.parseInt(elements[1]);
			input.d = Integer.parseInt(elements[2]);
			list.add(input);
		    }
		Collections.sort(list,new Comparator<Pox>(){
			@Override
			    public int compare(Pox a,Pox b)
			{
			    if(a.t > b.t)
				{
				    return 1;
				}
			    return -1; 		    

			}
		    });


		boolean[][] infected = new boolean[2][N+1];
		for(int i=0;i<=N;i++)
		    infected[0][i] = infected[1][i] = false;
		infected[0][1] = true;


		int time = list.get(0).t;
		for(int i=0;i<M;i++)
		    {
		
			if(time != list.get(i).t){
			    for(int j=0;j<=N;j++)
				{
				    if(infected[1][j])
					{
					    infected[0][j] = infected[1][j];
					    infected[1][j] = false;
					}
				    
				}			    
			    time = list.get(i).t;
			}

			if(infected[0][list.get(i).s])
			    {
				infected[1][list.get(i).d] = true;
			    }
			
		    }



		int cnt = 0;
		for(int i=0;i<=N;i++)
		    if(infected[0][i] || infected[1][i])
			{
			cnt++;

			}
		System.out.println(cnt);
	    }
 
    }
}