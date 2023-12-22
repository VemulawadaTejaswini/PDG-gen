
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int N = Integer.parseInt(ST.nextToken()), M = Integer.parseInt(ST.nextToken()), observationHeight[] = new int[N]; HashMap<Integer, ArrayList<Integer>> Roads = new HashMap<>();
		ST = new StringTokenizer(BR.readLine());
		for (int i = 0; i < N; i++) observationHeight[i] = Integer.parseInt(ST.nextToken());
		for (; M > 0; M--) 
		{
			ST = new StringTokenizer(BR.readLine());
			int Start = Integer.parseInt(ST.nextToken()) - 1, End = Integer.parseInt(ST.nextToken()) - 1;
			ArrayList<Integer> Connections = Roads.getOrDefault(Start, new ArrayList<>());
			if (!Connections.contains(End))
			Connections.add(End);
			Roads.put(Start, Connections);
			Connections = Roads.getOrDefault(End, new ArrayList<>());
			if (!Connections.contains(Start))
			Connections.add(Start);
			Roads.put(End, Connections);
		}
		int goodCount = 0;
		for (int i = 0; i < N; i++)
		{
			int Height = observationHeight[i];
			boolean Good = true;
			if (Roads.containsKey(i))
				for (Integer I : Roads.get(i))
				{
					if (observationHeight[I] >= Height) { Good = false; break; }
				}
			if (Good) goodCount++;
		}
		System.out.println(goodCount);
	}
}
