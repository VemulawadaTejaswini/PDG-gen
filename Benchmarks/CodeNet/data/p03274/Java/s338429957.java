import java.io.*;
import java.util.*;
/**
 * @author Rick
 *
 */
public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("T03LightCandles.txt"));
		java.io.BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken().trim());
		int K=Integer.parseInt(st.nextToken().trim());
		int[] Candles=new int[N];
		int ZeroPosition= -1;
	    st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			int candle=Integer.parseInt(st.nextToken().trim());
			Candles[i]=candle;
			if(i==0 && candle>0)
			{
				ZeroPosition= -1;
			}
			else if(i>0 && candle > 0 && Candles[i-1] <0 && ZeroPosition== -1)
			{
					ZeroPosition=i;
			}		
		}
		
		if(ZeroPosition== -1)
		{
			if(Candles[0]<0)
			{
				System.out.println(CaclStep(Candles[Candles.length-K],0));
			}
			else
			{
				System.out.println(CaclStep(0,Candles[K-1]));
			}		
		}
		else
		{
			int MinStep=100000000;
			for(int i=ZeroPosition - K<0?0:ZeroPosition-K;i<=N-K;i++)
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