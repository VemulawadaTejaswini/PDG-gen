
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		long K = Long.parseLong(sc.next());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0 ; i<100000 ; i++){
			list.add(-0);
		}
		for(int i=0;i<N;i++){
			Integer a = sc.nextInt();
			Integer b = sc.nextInt();
			if(list.get(a-1) == 0){
				list.set(a-1,b);
			}
			else{
				int tmp = list.get(a-1);
				list.set(a-1,tmp+b);
			}
		}
		int result = 0;
		for(int i=0;i<100000;i++) {
			K-=list.get(i);
			if(K<=0){
				result = i+1;
				break;
			}
		}
		out.println(result);

	sc.close();
	out.flush();
	}
}


