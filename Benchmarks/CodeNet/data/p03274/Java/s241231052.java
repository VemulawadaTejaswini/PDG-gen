import java.io.*;
import java.util.*;
/**
 * @author Rick
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		java.io.BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken().trim());
		int K=Integer.parseInt(st.nextToken().trim());
		int[] Candles=new int[N];
		int ZeroPosition= -1;
		int NegativeCount=0, ZeroCount=0, PositiveCount=0;
		int MinStep=100000000;
		
	    st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			int candle=Integer.parseInt(st.nextToken().trim());
			Candles[i]=candle;
			if(candle==0)
			{
				ZeroCount=1;
				ZeroPosition = i;	
			}
			else if(candle<0)
			{
				NegativeCount++;
			}
			else
			{
				PositiveCount++;
			}
		}
		
		if(ZeroCount==1)
		{
			for(int i=ZeroPosition-K+1 <0 ? 0: ZeroPosition-K+1;i<ZeroPosition+K;i++)
			{
				if(i<0)
					continue;
				if(i+K > Candles.length)
					break;
				int Step=CaclStep(Candles[i],Candles[i+K-1]);
				if(MinStep>Step)
					MinStep=Step;				
			}
			System.out.println(MinStep);
			
		}
		else
		{
			if(PositiveCount==0)
				System.out.println(CaclStep(Candles[Candles.length-K],0));
			else if(NegativeCount==0)
				System.out.println(CaclStep(0,Candles[K-1]));
			else
			{	
				for(int i=ZeroPosition-K<0 ? 0 : ZeroPosition-K;i<=N-K;i++)
				{
					if(i<0)
						continue;
					if(i+K > Candles.length)
						break;
					int Step=CaclStep(Candles[i],Candles[i+K-1]);
					if(MinStep>Step)
						MinStep=Step;				
				}
				System.out.println(MinStep);
			}
		}
	}
	
	private static int CaclStep( int i, int j)
	{
		if(i<0 && j>0)
		{
			if(i*-1 >= j)
				return i*-1 + j*2;
			else
				return i*-2 +j;
		}
		else if(i<0 && j<=0)
		{
			return i*-1;
		}
		else if (i>=0 && j>0)
		{ 
			return j;
		}
		else
		{ 
			return j;
		}
	}
}