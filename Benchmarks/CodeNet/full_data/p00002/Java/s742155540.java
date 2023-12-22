import java.util.*;
class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Main app = new Main();
		System.out.println(app.length(sc.nextInt(),sc.nextInt()));
	}
	
	
	
	int length(int a,int b){
		int ans = 1;
		a += b;
		while(true){
			if(a / 10 > 0){
				ans ++;
				a /=10;
			}else break;
		}
		return ans;
	}
	
	
	
	
	
	
}