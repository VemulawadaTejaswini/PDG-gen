import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		Deque<Integer> train =new ArrayDeque<Integer>();
while(sc.hasNext()) {
	int a=sc.nextInt();
	if(a!=0)train.addFirst(a);
	if(a==0)System.out.println(train.pollFirst());
}
		}
	}

