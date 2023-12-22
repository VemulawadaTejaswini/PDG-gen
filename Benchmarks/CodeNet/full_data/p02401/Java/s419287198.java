import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new LinkedList<>();
		List<Integer> b = new LinkedList<>();
		List<String> op = new LinkedList<>();
		int n, m;
		String s;

		while(true){
			n = sc.nextInt();
			s = sc.next();
			m = sc.nextInt();
			if(s.equals("?")){
				break;
			}
			a.add(n);
			b.add(m);
			op.add(s);
		}
		for(int i = 0;i < op.size(); i++){
			switch(op.get(i)){
				case "+":
					System.out.println(a.get(i) + b.get(i));
					break;
				case "-":
					System.out.println(a.get(i) - b.get(i));
					break;
				case "/":
					System.out.println(a.get(i) / b.get(i));
					break;
				case "*":
					System.out.println(a.get(i) * b.get(i));
					break;
				default:
			}
		}
	}
}

