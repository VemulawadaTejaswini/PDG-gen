import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static final int LENGTH = 10;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i, j;
		ArrayList<Sequence> list = new ArrayList<>(0);
		for(i=0; i<n; i++)
			list.add(new Sequence(br.readLine()));
		
		long result = 0;
		long tmpResult;
		Sequence base;
		while( 1 < list.size() ){
			base = list.get(0);
			list.remove(0);
			tmpResult = 0;
			for(i=0; i<list.size(); i++){ 
				if( base.equals(list.get(i)) ){
					list.remove(i--);
					tmpResult++;
				}
			}
			result += tmpResult * (tmpResult+1) /2;
		}
		
		System.out.println(result);
	}
	
	public static class Sequence{
		private int[] sequence;
		
		public Sequence(String str){
			this.sequence = new int[26];
			
			for(int i=0; i<LENGTH; i++)
				this.sequence[(int)(str.charAt(i)) - 0x61]++;
		}
		
		@Override
		public boolean equals(Object otherObj){
			if( !(otherObj instanceof Sequence) )
				return false;
			
			Sequence other = (Sequence)otherObj;
			
			int i = 0;
			int count = 0;
			for(; i<26 && this.sequence[i] == other.sequence[i]; i++){
				count += this.sequence[i];
				if( count == 10 ){
					i = 26;
					break;
				}
			}

			return i == 26;
		}
	}
}
