import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0240();
	}
	
	class AOJ0240{
		int n,y;
		int doIt(){
			int result = 0;
			
			
			
			return result;
		}
		
		
		public AOJ0240() {
			while(true){
				n = in.nextInt();
				if(n==0)break;
				y = in.nextInt();
				ArrayList<Bank> list = new ArrayList<Bank>();
				for(int i=0;i<n;i++)list.add(new Bank(in.nextInt(), in.nextInt(), in.nextInt()));
				int result = 0;
				double max = Integer.MIN_VALUE;
				for(int i=0;i<n;i++)if(list.get(i).sum>max){
					max = list.get(i).sum;
					result = list.get(i).ban;
				}
//				for(int i=0;i<n;i++)System.out.println(list.get(i).ban+" "+list.get(i).sum);
				System.out.println(result);
			}
		}
		
		class Bank{
			int ban,syu,ritu;
			double sum;
			public Bank(int ban,int ritu,int syu) {
				this.ban = ban;
				this.syu = syu;
				this.ritu = ritu;
				if(syu==1){
					this.sum = (double)(1+y*(1.0*ritu/100));
				}
				else{
					this.sum = (double)(Math.pow(1+(1.0*ritu/100), y));
				}
			}
		}
	}

}