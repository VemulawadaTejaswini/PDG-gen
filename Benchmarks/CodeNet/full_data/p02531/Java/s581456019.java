import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
//		new Problem_C();
		new AOJ10032();
	}
	
	
	class AOJ10032{
		public AOJ10032(){
			ArrayList<String> list = new ArrayList<String>();
			while(true){
				String meirei = in.next();
				if(meirei.equals("quit"))break;
				if(meirei.equals("push"))list.add(in.next());
				else if(meirei.equals("pop"))System.out.println(list.remove(list.size()-1));
			}
		}
	}
	
	
	class Problem_C{
		int X,Y,right,mirror,left;
		int x,y;
		
		void doIt(){
			x = in.nextInt();
			y = in.nextInt();
			int result_x=x,result_y=y;
			int mx = X, my = Y, work; 
			switch (right) {
			case 0:
				break;
			case 1:
				work=mx;mx=my;my=work;//swap
				work = x;
				result_x = mx-result_x;
				result_y = work;
				break;
			case 2:
				result_x = mx-result_x;
				result_y = my-result_y;
				break;
			case 3:
				work=mx;mx=my;my=work;//swap
				work = result_x;
				result_x = result_y;
				result_y = my - work;
				break;
			}

			System.out.println(result_x+" "+result_y);
			switch (mirror) {
			case 0:
				break;

			case 1:
				result_x = mx-result_x+1;
				break;
			}

			System.out.println(result_x+" "+result_y);
			switch (left) {
			case 0:
				break;
			case 1:
				work=mx;mx=my;my=work;//swap
				work = result_x;
				result_x = result_y;
				result_y = my - work;
				break;
			case 2:
				result_x = mx-result_x;
				result_y = my-result_y;
				break;
			case 3:
				work=mx;mx=my;my=work;//swap
				work = x;
				result_x = mx-result_x;
				result_y = work;
				break;
			}
			System.out.println(result_x+" "+result_y);
		}
		
		public Problem_C() {
			X = in.nextInt();
			Y = in.nextInt();
			right = in.nextInt()%4;
			mirror = in.nextInt()%2;
			left = in.nextInt()%4;
			int p = in.nextInt();
			for(int i=0;i<p;i++)doIt();
		}
	}
}