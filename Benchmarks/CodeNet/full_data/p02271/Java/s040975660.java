import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		Deque<Integer> stack = new ArrayDeque<>();
		stack.offer(0);
		String[] str = scanner.nextLine().split(" ");
		int x = 0;

		for(int i = 0; i < n; i++){
			x = Integer.parseInt(str[i]);
			Deque<Integer> temp = new ArrayDeque<>(stack);
			for(int j = 0; j <= temp.size(); j++){
				int a = x + temp.poll();
				stack.offer(a);
				System.out.println(a);
			}
		}

		int q = Integer.parseInt(scanner.nextLine());
		String[] m_i = scanner.nextLine().split(" ");
		for(int i = 0; i < q; i++){
			if(stack.contains(Integer.parseInt(m_i[i]))){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}

	}
}