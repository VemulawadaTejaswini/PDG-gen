import java.io.*;
import java.util.*;
/**
 * @author Rick
 *
 */
public class Main{

	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("T03LightCandles.txt"));
		java.io.BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken().trim());
		int K=Integer.parseInt(st.nextToken().trim());
		int[] Candles=new int[N];
		int NegativeCount=0, ZeroCount=0;
		int MinStep=100000000;
		
	    st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			int candle=Integer.parseInt(st.nextToken().trim());
			Candles[i]=candle;
			if(candle==0)
			{
				ZeroCount=1;
			}
			else if(candle<0)
			{
				NegativeCount++;
			}
		}
		
		int i=0,Endi=0;
		if(NegativeCount+ZeroCount>=K)
			i=NegativeCount+ZeroCount-K;
		else
			i=0;
		if(NegativeCount+ZeroCount==0)
			Endi=1;
		else
			Endi=N-K+1;

		for(;i<Endi;i++)
		{
			int Step=CaclStep(Candles[i],Candles[i+K-1]);
			if(MinStep>Step)
				MinStep=Step;				
		}
	     System.out.println(MinStep);
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