import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			char[][] b = new char[14][14];
			for (int i = 0; i < 14; i++)
				Arrays.fill(b[i], '0');
			String s = null;
			for (int i = 0; i < 12; i++) {
				s = bf.readLine();
				if(s==null)break;
				if(s.length()==0){i--;continue;}
				char[] t = s.toCharArray();
				for (int j = 0; j < 12; j++)
					b[i + 1][j + 1] = t[j];
			}
			if (s == null)
				break;
			int c = 0;
			ArrayDeque<Integer> xq = new ArrayDeque<Integer>();
			ArrayDeque<Integer> yq = new ArrayDeque<Integer>();
			for (int i = 1; i < 13; i++) {
				for (int j = 1; j < 13; j++) {
					if(b[i][j]!='1')continue;
					xq.addLast(i);yq.addLast(j);
					c++;
					while(!xq.isEmpty()){
						int x = xq.pollFirst();
						int y = yq.pollFirst();
						if(b[x][y] != '1')continue;
						b[x][y] = (char)(c+'a'); //'0'
						xq.addLast(x);xq.addLast(x);xq.addLast(x-1);xq.addLast(x+1);
						yq.addLast(y+1);yq.addLast(y-1);yq.addLast(y);yq.addLast(y);
					}
				}
			}
			System.out.println(c);
		}
	}
}