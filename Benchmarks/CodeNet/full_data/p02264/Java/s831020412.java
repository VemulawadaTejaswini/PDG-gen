import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue queue = new Queue();
		String[] input;
		int n, q;
		int end_time = 0;
		String[] name;
		int[] time;

		input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		q = Integer.parseInt(input[1]);
		name = new String[n];
		time = new int[n];

		for(int i = 0; i < n; i++){

			input = br.readLine().split(" ");
			name[i] = input[0];
			time[i] = Integer.parseInt(input[1]);
			queue.enqueue(i);

		}

		while(!queue.isEmpty()){

			int index = queue.dequeue();

			if(time[index] > q){
				end_time += q;
				time[index] -= q;
				queue.enqueue(index);
			}else{
				end_time += time[index];
				time[index] = 0;
				System.out.println(name[index] + " " + end_time);
			}

		}

	}

}

class Queue{

	private int head = 0;
	private int tail = 0;
	private int len = 100000;
	private int[] data = new int[len];

	public void enqueue(int x){

		data[tail] = x;

		if(tail == len - 1){
			tail = 0;
		}else{
			tail++;
		}

	}

	public int dequeue(){

		int x = data[head];

		if(head == len - 1){
			head = 0;
		}else{
			head++;
		}

		return x;

	}

	public boolean isEmpty(){

		if(head == tail){
			return true;
		}else{
			return false;
		}

	}

}