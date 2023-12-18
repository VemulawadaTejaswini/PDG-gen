import java.util.*;
public class Main {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = Integer.parseInt(s);
		
		
		s = sc.next();
		int m = Integer.parseInt(s);
		
		int p[] = new int[m];
		String ss[] = new String[m];

		for(int i=0;i<m;i++) {
			s = sc.next();
			p[i]= Integer.parseInt(s);

			s = sc.next();
			ss[i]= s;

		}
		
		int [] ans = core(n,m,p,ss);

		System.out.println(ans[0]+ " "+ ans[1]);
	}
	
	static int[] core(int n,  int m , int[] p,String[] ss) {
		int maxP = 0;
		int pena = 0;
				
		for(int i=0;i<m;i++) {
			if( p[i]> maxP )maxP= p[i];
		}
		
		boolean state[] = new boolean[maxP+1];//seitou?
		int right = 0;
		for(int i=0;i< maxP+1;i++) {
			state[i] = false;
		}

		for(int i=0;i< m;i++) {
			
			if(state[p[i]] == false ) {
				if(ss[i].equals("AC")){
					state[p[i]] = true;
					right ++;
				}else {	
					pena++;
			
				}		
			}
		}
		
		int[] ans = new int[2];
		ans[0] = right;
		ans[1] = pena;
		return ans;
		
	}
	
}