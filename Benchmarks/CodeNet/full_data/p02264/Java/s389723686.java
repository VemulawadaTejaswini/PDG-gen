import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args)throws Exception{
		Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<String> name_stack = new ArrayDeque<>();
		Deque<Integer> time_stack = new ArrayDeque<>();
		String[] s = scanner.nextLine().split(" ", 2);
		int n = Integer.parseInt(s[0]);
		int cpu = Integer.parseInt(s[1]);
		int count = 0;

		for(int i = 0; i < n; i++){
		    String[] data = scanner.nextLine().split(" ", 2);
			name_stack.offer(data[0]);
			time_stack.offer(Integer.parseInt(data[1]));
		}

		while(name_stack != null){
			String name = name_stack.poll();
			int time = time_stack.poll();

			if(time > cpu){
				time -= cpu;
				name_stack.offer(name);
				time_stack.offer(time);
				count += cpu;
			}else{
				count += time;
				System.out.println(name + " " + count);
			}

		}
	}
}