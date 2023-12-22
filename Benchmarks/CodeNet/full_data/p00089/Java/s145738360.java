import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		ArrayDeque<int[]> que = new ArrayDeque<int[]>();
		Main app = new Main();
		String string;
		
		int map[][] = new int[100][100], max = 0, y = 0, x = 0, sum = 0, res = 0;
		while((string = reader.readLine()) != null){
			if(string.length() == 0) break;
			int hoge[] = app.splitter(string);
			max = max > hoge.length ? max : hoge.length;
			int i = 0;
			for(int var : hoge){
				map[max - 1 - i][max - hoge.length + i] = var;
				i++;
			}
		}
		
		que.addLast(new int[]{y , x, map[y][x]});
		while(!que.isEmpty()){
			y = que.getFirst()[0];
			x = que.getFirst()[1];
			sum = que.getFirst()[2];
			que.removeFirst();
			
			if(res < sum) res = sum;
			
			if(y + 1< max){ que.addLast(new int[]{y + 1, x, sum + map[y + 1][x]}); }
			if(x + 1< max){ que.addLast(new int[]{y, x + 1, sum + map[y][x + 1]}); }
		}
		System.out.println(res);
		reader.readLine();
	}
	
	public int[] splitter(String source){
		String str[] = source.split(",");
		int hoge[] = new int[str.length];
		for(int i = 0; i < str.length; i++)
			hoge[i] = Integer.valueOf(str[i]);
		return hoge;
	}
}