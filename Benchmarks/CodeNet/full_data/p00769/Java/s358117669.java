import java.util.*;

public class Main{

	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		for(int i=s.nextInt();i>0;--i)
			solve();
	}
	static ArrayDeque<ArrayList<Integer>>stack=new ArrayDeque<>();
	static void solve(){
		Scanner sc=new Scanner(s.next().replaceAll("([^\\d])"," $1 "));
		stack.add(new ArrayList<>());
		do {
			String n=sc.next();
			if(n.equals("[")) {
				stack.push(new ArrayList<>());
			}else if(n.equals("]")) {
				ArrayList<Integer>l=stack.pop();
				int v=l.stream().sorted().mapToInt(o->o).sorted().limit(l.size()/2+1).sum();
				stack.peek().add(v);
			}else {
				stack.peek().add(Integer.parseInt(n)/2+1);
			}
		}while(stack.size()>1);
		System.out.println(stack.pop().get(0));
	}
}
