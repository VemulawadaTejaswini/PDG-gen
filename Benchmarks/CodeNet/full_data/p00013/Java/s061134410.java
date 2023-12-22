
import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		Stack<Integer> st=new Stack<Integer>();
		while(sc.hasNext()){
			int val=sc.nextInt();
			if(val!=0){
				st.add(val);
			}else{
				ln(st.pop());
			}
		}
	}	
	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}