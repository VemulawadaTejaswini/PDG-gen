import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input_str[] = br.readLine().split("\\s+");
			int N = Integer.parseInt(input_str[0]);
			int LIMIT = Integer.parseInt(input_str[1]);

			Queue Q = new Queue(N);

			for(int loop = 0; loop < N; loop++){

				input_str = br.readLine().split("\\s+");
				Q.push(new Process(input_str[0],Integer.parseInt(input_str[1])));
			}

			int current = 0;

			StringBuilder ans = new StringBuilder();

			while(!Q.isEmpty()){

				Process tmp = Q.pop();

				if(tmp.getTIME() <= LIMIT){

					current += tmp.getTIME();
					ans.append(tmp.getName()).append(" ").append(Integer.toString(current)).append("\n");

				}else{

					current += LIMIT;
					tmp.setTIME(tmp.getTIME()-LIMIT);
					Q.push(tmp);
				}
			}

			System.out.print(ans.toString());

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}


class Process{

	private String name;
	private int TIME;

	Process(String arg_name,int arg_TIME){
		name = arg_name;
		TIME = arg_TIME;
	}

	public String getName() {
		return name;
	}

	public int getTIME() {
		return TIME;
	}

	public void setTIME(int arg_TIME) {
		TIME = arg_TIME;
	}
}

class Queue{

	private Process[] table;
	private int head;
	private int tail;
	private int size;
	private int num_data;

	Queue(int arg_size){

		size = arg_size;
		table = new Process[arg_size];
		head = 0;
		tail = 0;
		num_data = 0;
	}

	boolean isEmpty(){

		return num_data == 0;
	}

	void push(Process process){

		table[tail] = process;
		tail = (tail+1)%size;
		num_data++;
	}

	public Process pop(){

		head = (head+1)%size;
		num_data--;
		return table[(head-1+size)%size];
	}
}
