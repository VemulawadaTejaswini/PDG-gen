import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		int i, j;
		Job[] jobs = new Job[n];
		for(i=0; i<n; i++)
			jobs[i] = new Job(br.readLine());
		
		//sort
		Job tmp;
		for(i=0; i<n-1; i++) for(j=i; j<n; j++) if( jobs[i].compareTo(jobs[j]) < 0 ){
			tmp = jobs[i];
			jobs[i] = jobs[j];
			jobs[j] = tmp;
		}
		
		int now = 0;
		int result = 0;
		for(i=0; i<n; i++) if( jobs[i].receive <= m-now ){
			now++;
			result += jobs[i].reward;
		}
		
		System.out.println(result);
	}
	
	public static class Job implements Comparable<Job>{
		public int receive, reward;
		
		public Job(String str){
			String[] line = str.split(" ");
			this.receive = Integer.parseInt(line[0]);
			this.reward = Integer.parseInt(line[1]);
		}

		@Override
		public int compareTo(Job other){
			if( this.reward < other.reward )
				return -1;
			else if( other.reward < this.reward )
				return 1;
			else if( this.receive < other.receive )
				return -1;
			else if( other.receive < this.receive )
				return 1;
			
			return 0;
		}
	}
}
