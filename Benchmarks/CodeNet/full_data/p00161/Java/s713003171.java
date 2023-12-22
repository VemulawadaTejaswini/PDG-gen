import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, sum;
		
		while(!(string = reader.readLine()).equals("0")){
			PriorityQueue<Pair> que = new PriorityQueue<Pair>();
			n = Integer.valueOf(string);
			for(int i = 0; i < n; i++){
				String s[] = reader.readLine().split(" ");
				sum = 0;
				for(int j = 1; j < 9; j++){
					sum += Integer.valueOf(s[j]) * (j % 2 == 0 ? 1 : 60);
				}
				que.add(new Pair(sum, Integer.valueOf(s[0])));
			}
			for(int i = 0; i < 3; i++){
				if(i == 2){
					for(int j = i; j < n - 2; j++) que.poll();
				}
				System.out.println(que.poll().second);
			}
		}
		reader.close();
	}
}

class Pair implements Comparable<Pair>{
	int first, second;
	Pair(int first, int second){
		this.first = first;
		this.second = second;
	}
	@Override
	public int compareTo(Pair o) {
		return first - o.first;
	}
}