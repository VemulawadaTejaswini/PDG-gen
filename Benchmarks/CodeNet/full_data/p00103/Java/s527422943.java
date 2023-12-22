import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new aoj103().doIt();
	}
	class aoj103{
		String a[] ={"HIT","OUT","HOMERUN"}; 
		int baseball(int cnt,int out){
			Queue<Integer> que = new LinkedList<Integer>();
			que.add(0);que.add(0);que.add(0);
			while(true){
				String str = sc.next();
				if(str.equals(a[0])){
					que.add(1);
					cnt = cnt + que.remove();
				}else if(str.equals(a[1])){
					out++;
				}else{
					que.add(1);que.add(0);que.add(0);que.add(0);
					cnt = cnt + que.remove();
					cnt = cnt + que.remove();
					cnt = cnt + que.remove();
					cnt = cnt + que.remove();
				}
				if(out == 3){
					break;
				}
			}
			return cnt;
		}
		void doIt(){
			int n = sc.nextInt();
			for(int i = 0;i < n;i++){
				int cnt = 0,out = 0;
				System.out.println(baseball(cnt,out));			
			}
	    }
	}
}