import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		int mini = 10000;
		
		for(int i = 1; i < 1001; ++i){
		    
		    int a_ans = (int)(i * 0.08);
		    int b_ans = (int)(i * 0.10);
		    
		    if((a_ans == a) && (b_ans == b)) {
		        if(mini >= i) mini = i;
		        else continue;
		    }
		    else continue;
		}
		
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(mini);
		
		if(mini == 10000) System.out.println(-1);
		else System.out.println(mini);
		
	}
}