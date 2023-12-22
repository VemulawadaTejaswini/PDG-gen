import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0218();
	}
	
	class AOJ0218{
		int math,english,japanese;
		boolean is_A(){
			if(math==100||english==100||japanese==100)return true;
			if((math+english)/2>=90)return true;
			if((math+english+japanese)/3>=80)return true;
			return false;
		}
		
		boolean is_B(){
			if((math+english+japanese)/3>=70)return true;
			if((math+english+japanese)/3>=50&&(math>=80)||english>=80)return true;
			return false;
		}
		
		void doIt(){
			math = in.nextInt();english = in.nextInt();japanese = in.nextInt();
			if(is_A()){
				System.out.println("A");
				return;
			}else if(is_B()){
				System.out.println("B");
				return;
			}else System.out.println("C");
		}
		
		public AOJ0218() {
			while(true){
				int n = in.nextInt();
				if(n<=0)break;
				for(int i=0;i<n;i++)doIt();
			}
		}
	}
	
}