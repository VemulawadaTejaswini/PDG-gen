import java.util.Scanner;

public class Main {

	static int max;
	static int Q[];
	static String P[];
	static int head;
	static int tail;

	static void initialize() {
		head = 0;
		tail = 0;
	}

	static boolean isEmpty() {
		return head == tail;
	}

	static boolean isFull() {
		return head == (tail+1)%max;
	}

	static void enqueue1(int x) {
		if(!isFull()) {
			Q[tail] = x;
			if(tail+1 ==max) {
				tail = 0;
			}else {
				tail++;
			}
		}
	}

	static void enqueue2(String s) {
		if(!isFull()) {
			P[tail] = s;
		}
	}

	static int dequeue1() {
		if(!isEmpty()) {
			int x = Q[head];
			if(head+1 == max) {
				head = 0;
			}else {
				head++;
			}
			return x;
		}else {
			return -1;
		}
	}

	static String  dequeue2() {
		if(!isEmpty()) {
			String s = P[head];
			return s;
		}else {
			return "";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		max = n + 1;
		P = new String[max];
		Q = new int[max];
		int q = sc.nextInt();
		initialize();
		
		for(int i=0;i<n;i++) {
			enqueue2(sc.next());
			enqueue1(sc.nextInt());
		}
		int time = 0;
		while(!isEmpty()) {
			String s = dequeue2();
			int x = dequeue1();
			if(x <= q) {
				time += x;
				System.out.println(s + " " + time);
			}else {
				x -= q;
				enqueue2(s);
				enqueue1(x);
				time += q;
			}
		}

	 }
}


