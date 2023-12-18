import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		ArrayList<Pair> pairs = new ArrayList<>(0);
		int j;
		Pair p;
		for(int i=1; i<n; i++){
			array[i] = Integer.parseInt(br.readLine());
			for(j=0; j<pairs.size(); j++){
				p = pairs.get(j);
				if(p.e < array[i]){
					p.e = array[i];
					break;
				}
			}
			if( j == pairs.size() )
				pairs.add(new Pair(array[i], array[i]));
		}
		System.out.println(pairs.size());
	}
	public static class Pair{
		int s, e;
		
		public Pair(int s, int e){
			this.s = s;
			this.e = e;
		}
	}
}
