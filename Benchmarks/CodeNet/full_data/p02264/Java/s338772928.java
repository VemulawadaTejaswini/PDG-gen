import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		run();
	}
	static void run(){
		int n, q;
		int count;
		int timeCount;
		
		count = 0;
		timeCount = 0;
		
		n = scan.nextInt();
		q = scan.nextInt();
		
		String[] nameAns = new String[n];
		int [] timeAns = new int[n];
		
		LinkedList<String> name = new LinkedList();
		LinkedList<Integer> time = new LinkedList();
		
		for(int i = 0; i < n; i++){
			name.offer(scan.next());
			time.offer(scan.nextInt());
		}
		
		for(;;){
			if(time.peek() - q <= 0){
				nameAns[count] = name.poll();
				timeCount += time.poll();
				timeAns[count] = timeCount;
				count++;
			}else{
				name.offer(name.poll());
				time.offer(time.poll() - q);
				timeCount += q;
			}
			if(count == n) break;
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(nameAns[i]+" "+timeAns[i]);
		}
	}
}