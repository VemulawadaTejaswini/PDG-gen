import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String first_input[] = br.readLine().split("\\s+");

			int N = Integer.parseInt(first_input[0]);
			int quantum = Integer.parseInt(first_input[1]);

			Queue<Process> Q = new ArrayDeque<Process>();

			for(int loop = 0; loop < N; loop++){
				String input[] = br.readLine().split("\\s+");
				Q.add(new Process(input[0],Integer.parseInt(input[1])));
			}

			StringBuilder ans = new StringBuilder();
			Process tmp = new Process();

			int current_time = 0;

			while(!Q.isEmpty()){
				tmp = Q.peek();
				Q.poll();

				if(tmp.getTime() <= quantum){
					current_time += tmp.getTime();
					ans.append(tmp.getName()).append(" ").append(Integer.toString(current_time)).append("\n");
				}else{
					current_time += quantum;
					Q.add(new Process(tmp.getName(),tmp.getTime()-quantum));
				}
			}

			System.out.printf("%s",ans.toString());

		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Process{

	private String name;
	private int time;

	Process(){
		//Do nothing
	}

	Process(String arg_name,int arg_time){
		name = arg_name;
		time = arg_time;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
