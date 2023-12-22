import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		new A().doIt();
	}
	
	
	class A{
		
		int[][] price;
		int[][] rePrice;
		
		void setPrice(){
			price = new int[101][20000];
			rePrice = new int[101][1001];
			for(int i=1;i<100;i++)for(int s=1;s<=1000;s++){
				double afterPrice = (int) s * (100.0 + i) / 100.0;
				price[i][(int)afterPrice] = s;
				rePrice[i][s] = (int)afterPrice;
			}
		}
		
		void doIt(){
			setPrice();
			while(true){
				int x = in.nextInt(), y = in.nextInt(), s = in.nextInt();
				if(x + y + s ==0)return;
				solve(x, y, s);
			}
		}
		
		void solve(int x,int y,int s){
			int max = -1;
			for(int a=1;a<s;a++){
				int b = s-a;
				int before_a = price[x][a];
				int before_b = price[x][b];
				int sum = rePrice[y][before_a] + rePrice[y][before_b];
				max = Math.max(max, sum);
			}
			System.out.println(max);
		}
		
	}

}