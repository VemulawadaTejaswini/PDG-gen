import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int min;
		List<Integer> Value = new ArrayList<Integer>();
		for(int i=0;i<N;i++)
		{
			Value.add(sc.nextInt());//Listに追加
		}		
		Collections.sort(Value);//昇順に並べ替え
		Collections.reverse(Value);//逆順に並べ替え
		min = Math.abs(Value.get(0)-Value.get(K-1));
		for(int j=1;j<N-K+1;j++)
		{
			int num = Math.abs(Value.get(j)-Value.get(j+K-1));
			if(min>num)
			{
				min = num;
			}
		}
		System.out.println(min);

	}
}