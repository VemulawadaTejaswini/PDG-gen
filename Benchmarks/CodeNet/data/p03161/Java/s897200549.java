import java.util.*;
import java.io.*;

public class Main
{

public static void main( String[] args ) throws Exception
{
	final Scanner sc = new Scanner( System.in );
	final int N = sc.nextInt();//総数
	final int K = sc.nextInt();//バッファサイズ
	
	//そのhにたどり着くまでの最低コストを記録するLinkedList
	final LinkedList<Integer> costList = new LinkedList<>();
	
	//それぞれのhを記録するLinkedList
	final LinkedList<Integer> heightList = new LinkedList<>();
	
	//初期化
	int firstH = sc.nextInt();
	for( int i = 0; i < K; ++i )
	{
		costList.add( 0 );
		heightList.add( firstH );
	}
	
	while( sc.hasNext() )
	{
		//次に調べるべき足場の高さを取得
		final int h = sc.nextInt();
		
		//直近のK個の足場それぞれから、今回の足場にたどり着く際の最低コストを探す
		final Iterator<Integer> cost = costList.iterator();
		final Iterator<Integer> height = heightList.iterator();
		int minCost = Integer.MAX_VALUE;
		for( int i = 0; i < K; ++i )
		{
			int costOfI = cost.next() + Math.abs( height.next() - h );
			if( costOfI < minCost )
			{
				minCost = costOfI;
			}
		}
		
		//今回の足場へ到達する最低コストが確定
		
		//不要となったK個前の情報を捨てる
		costList.remove( 0 );
		heightList.remove( 0 );
		
		//今回の足場の情報を追記する
		costList.add( minCost );
		heightList.add( h );
	}
	
	p( costList.getLast() );
}

public static void p( Object o )
{
	System.out.println( o );
}

}