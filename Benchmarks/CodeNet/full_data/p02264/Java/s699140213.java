import java.io.IOException;
import java.util.Scanner;
public class Main {

	private static int max; // 要素の数
	private static int run; // 処理速度
	private static Object q[]; // queue
	private static String end[]; // 処理済み
	private static int count; // 処理済み数
	private static int front; // 先頭
	private static int rear; // 末尾
	private static int time; // 合計処理時間

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		max = sc.nextInt();
		run = sc.nextInt();

		q = new Object[max+1];
		front = rear = count = time = 0;
		end = new String[max];

		for(int i=0;i<max;i++) {
			String a = sc.next();
			int b = sc.nextInt();
			enqueue(a + " " +b);
		}

		while(true) {
			String[] line = dequeue().toString().split(" ");
			int x = Integer.parseInt(line[1]);
			// 処理時間以内なら
			if(x <= run) {
				time += x;
				end[count++] = line[0] + " " + Integer.toString(time);
			// 処理時間以上なら
			}else {
				line[1] = Integer.toString(x - run);
				enqueue(line[0] + " " + line[1]);
				time += run;
			}

			if(count == max) {
				break;
			}
		}

		show();

		sc.close();
	}

	public static void show() {
		for(int i=0;i<max;i++) {
			System.out.println(end[i]);
		}
	}

	/*
	 * ポインタの位置
	 */
	public static int next(int a) {
		return (a + 1) % max;
	}

	/*
	 * 入れる
	 */
	public static void enqueue(Object x) {
/*		if(next(rear) == front) {
			throw new IllegalStateException();
		}*/
		q[rear] = x;
		rear = next(rear);
	}

	/*
	 * 取り出す
	 */
	public static Object dequeue() {
		Object x = q[front];
		q[front] = null;
		front = next(front);
		return x;
	}
}
