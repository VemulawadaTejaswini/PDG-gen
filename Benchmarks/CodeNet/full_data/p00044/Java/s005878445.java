import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	
	static boolean[] prime = new boolean[50100];
	static int[] bp = new int[50100];
	static int[] np = new int[50100];
	
	public static void main(String[] args){
		ersis();
		while(scan.hasNext()){
			int n = si();
			out.println(bp[n]+" "+np[n]);
		}
		out.flush();
	}
	
	static void ersis(){
		prime[0] = prime[1] = true;
		for (int i = 0; i*i < 50100 ; i++){
			if(!prime[i]){
				for (int j = i*2; j < 50100 ; j+=i)
					prime[j] = true;
			}
		}
		int tmp = 0;
		for (int i = 0; i < 50100; i++){
			bp[i] = tmp;
			if(!prime[i]){
				for (int j = tmp; j < i ; j++)
					np[j] = i;
				tmp = i;
			}
		}
	}
	
	static int si(){
		return Integer.parseInt(scan.next());
	}
}