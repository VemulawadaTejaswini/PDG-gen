import java.util.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args){
		Deque<Integer> S = new ArrayDeque<Integer>();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] str = line.split(" ");
		for(String s : str){
			if(s.equals(""))
				break;
			if(s.equals("+")){
				int b = S.pop();
				int a = S.pop();
				S.push(a + b);
//				System.out.printf("%d + %d = %d\n", a, b, a+b);
			}else if(s.equals("-")){
				int b = S.pop();
				int a = S.pop();
				S.push(a - b);
//				System.out.printf("%d - %d = %d\n", a, b, a - b);
			}else if(s.equals("*")){
				int b = S.pop();
				int a = S.pop();
				S.push(a * b);
//				System.out.printf("%d * %d = %d\n", a, b, a * b);
			}else{
				S.push(Integer.parseInt(s));
//				System.out.printf("insert %d\n", Integer.parseInt(s));
			}
//			System.out.println(S);
		}
		sc.close();
		System.out.println(S.getFirst().intValue());

	}

}
