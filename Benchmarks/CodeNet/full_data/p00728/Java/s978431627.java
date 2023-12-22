import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ1147().doIt();
	}
	
	class AOJ1147{
		void doIt(){
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				int[] hyou = new int[n];
				for(int i=0;i<n;i++)hyou[i] = in.nextInt();
				Arrays.sort(hyou);
				int result = 0;
				for(int i=1;i<n-1;i++)result+=hyou[i];
				System.out.println(result/(n-2));
			}
		}
	}
	
}