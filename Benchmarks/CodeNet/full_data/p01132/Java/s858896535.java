import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ2007().doIt();
	}
	
	class AOJ2007{
		int n,money[];
		int[] array;
		int getMoney(int a,int b,int c,int d){
			int result = 0;
			int sum = a*10+b*50+c*100+d*500;
			int siharai = n-sum;
			if(siharai>0)return Integer.MAX_VALUE/2;
			siharai = Math.abs(n-sum);
			while(siharai>=500){
				result++;siharai-=500;
			}
			while(siharai>=100){
				result++;siharai-=100;
			}
			while(siharai>=50){
				result++;siharai-=50;
			}
			while(siharai>=10){
				result++;siharai-=10;
			}
			return result;
		}
		
		void solve(){
			int[] result = new int[4];
			int sum = 0;for(int i=0;i<4;i++)sum+=money[i];
			int rsum = Integer.MAX_VALUE;
			for(int ten=0;ten<=money[0];ten++)
				for(int five=0;five<=money[1];five++)
					for(int hund=0;hund<=money[2];hund++)
						for(int fhund=0;fhund<=money[3];fhund++){
							int a = getMoney(ten, five, hund, fhund);
							int cnt = sum-(ten+five+hund+fhund)+a;
							if(cnt>=rsum)continue;
							rsum = cnt;
							result[0] = ten;result[1] = five;
							result[2] = hund;result[3] = fhund;
						}
			for(int i=0;i<4;i++)if(result[i]>0){
				System.out.println(array[i]+" "+result[i]);
			}
		}
		
		void doIt(){
			array = new int[4];array[0] = 10;array[1] = 50;array[2] = 100;array[3] = 500;
			n = in.nextInt();
			if(n==0)return;
			money = new int[4];
			for(int i=0;i<4;i++)money[i] = in.nextInt();
			solve();
			while(in.hasNext()){
				System.out.println();
				n = in.nextInt();
				if(n==0)break;
				money = new int[4];
				for(int i=0;i<4;i++)money[i] = in.nextInt();
				solve();
			}
		}
	}
	
}