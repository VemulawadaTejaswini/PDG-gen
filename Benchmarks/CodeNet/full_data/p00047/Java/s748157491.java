import java.util.Arrays;
import java.util.Scanner;


public class Main {
	void solve(){
		
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		String b = "A";
		
		while(sc.hasNext()){
			String str[] = sc.next().split("\\,");
			String l = str[0];
			String r = str[1];
			if(b.equals(l)){
				b = r;
			}else if(b.equals(r)){
				b = l;
			}
		}
		
		System.out.println(b);
		
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		io();
	}
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}