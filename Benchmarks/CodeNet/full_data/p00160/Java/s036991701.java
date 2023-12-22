import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		new Main();	
	}
 
	public Main() {
		new A().doIt();
	}
	class A{
		int large[]={60,80,100,120,140,160};
		int kgs[]={2,5,10,15,20,25};
		int num[]={600,800,1000,1200,1400,1600};
		int money(int kg,int xyz){
			int result = 0;
			for(int i = large.length - 1;i >= 0;i--){
				if(kg <= kgs[i] && xyz <= large[i])result = num[i];
			}
			return result;
		}
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				int ans = 0;
				for(int i = 0;i < n;i++){
					int x = sc.nextInt();
					int y = sc.nextInt();
					int z = sc.nextInt();
					int kg = sc.nextInt();
					int max = Math.max(Math.max(x, y),z);
					ans = ans + money(kg,max);
				}
				System.out.println(ans);
			}
		}
	}
}