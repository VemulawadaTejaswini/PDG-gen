import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1179().doIt();
	}
	
	class AOJ1179{
		
		int calc(int y,int m,int d){
			int result = 0;
			for(int i=1;i<y;i++){
				for(int s=1;s<=10;s++){
					if(i%3==0)result+=20;
					else if(s%2==0)result+=19;
					else result += 20;
				}
			}
			for(int i=1;i<m;i++){
				if(y%3==0)result += 20;
				else if(i%2==0)result += 19;
				else result += 20;
			}
			result += d;
			return result;
		}
		
		void doIt(){
			int n = in.nextInt();
			int a = calc(1000, 1, 1);
//			System.out.println(a);
			for(int i=0;i<n;i++){
				int b = calc(in.nextInt(), in.nextInt(), in.nextInt());
//				System.out.println(b);
				System.out.println(a-b);
			}
		}
	}
	
}