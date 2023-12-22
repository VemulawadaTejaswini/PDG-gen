import java.util.*;
public class Main {
	Scanner sc;
	LinkedList<Integer> gdlist;
	
	void createGD() {
		gdlist = new LinkedList<Integer>();
		boolean f,f_;
		for(int i=1;;i++) {
			if(i*7-1>300000) break;
			f = f_ = false;
			for(Integer it:gdlist) {
				if((i*7-1)%it == 0) f_ = true;
				if((i*7+1)%it == 0) f = true;
				if(f&f_) break;
			}
			if(!f_) gdlist.add(i*7-1);
			if(!f)  gdlist.add(i*7+1);
		}
	}
	
	
	void run() {
		sc = new Scanner(System.in);
		createGD();
		while (true) {
			int n = sc.nextInt();
			if(n == 1) break;
			System.out.print(n + ": ");
			for(Integer it: gdlist) {
				if(n == 1) break;
				if(n % it != 0) continue;
				else {
					System.out.print(it);
//					while(n%it==0) n /= it;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}