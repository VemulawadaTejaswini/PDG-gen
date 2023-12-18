import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++){
			int a = Integer.parseInt(st.nextToken());
			if(a > 0) pos.add(a);
			else neg.add(a);
		}
		if(pos.isEmpty()){
			Collections.sort(neg);
			Collections.reverse(neg);
			pos.add(neg.remove(0));
		}
		else if(neg.isEmpty()){
			Collections.sort(pos);
			neg.add(pos.remove(0));
		}
		int x = neg.remove(0);
		int y = pos.remove(0);
		StringBuilder sb = new StringBuilder();
		while(!pos.isEmpty()){
			int a = pos.remove(0);
			sb.append(String.format("%d %d\n", x, a));
			x = x-a;
		}
		while(!neg.isEmpty()){
			int b = neg.remove(0);
			sb.append(String.format("%d %d\n", y, b));
			y = y-b;
		}
		sb.append(String.format("%d %d\n", y, x));
		bw.write(y-x+"\n");
		bw.write(sb.toString());
		bw.flush(); bw.close();
	}

}
