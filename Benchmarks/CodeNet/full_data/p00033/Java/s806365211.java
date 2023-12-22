import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static ArrayList<Integer>a = new ArrayList<Integer>();
	static ArrayList<Integer>b = new ArrayList<Integer>();
	static ArrayList<Integer>c = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		while(read()){
			
		}

	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		
		N = sc.nextInt();
		//System.out.println("N = " + N);
		for(int j = 0; j < N; j++){
			for(int i = 0; i < 10; i++){
				a.add(sc.nextInt());
				//System.out.println("a = " + a.get(i));
			}
			
			b.add(0);
			c.add(0);
			
			solve();
			
			a.clear();
			b.clear();
			c.clear();
		}	
		
		return true;
	}
	
	static void solve(){
		boolean f = true;
		
		for(int i = 0; i < 10; i++){
			
			int ball = a.get(i);
			//System.out.println(ball);
			int last_b = b.get(b.size()-1);
			int last_c = c.get(c.size()-1);
			
			if(ball < last_b && ball < last_c){
				f = false;
				//System.out.println(ball);
				break;
			}
			
			int abs_b = ball - last_b;
			int abs_c = ball - last_c;
			
			if( abs_b < 0 && abs_c < 0){
				f = false;
				//System.out.println(ball);
				break;
			}else if( abs_b < 0 && abs_c > 0 ){
				c.add(ball);
			}else if( abs_c < 0 && abs_b > 0){
				b.add(ball);
			}else if( abs_b > abs_c){
				c.add(ball);
			}else{
				b.add(ball);
			}
			
		}
		
		if(f){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	

}