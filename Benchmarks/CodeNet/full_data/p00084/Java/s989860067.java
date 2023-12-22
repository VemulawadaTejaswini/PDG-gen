public class Main{
	Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		new Main();	
	}
 
	public Main() {
		new Base().doIt();
	}
	class Base{
		String[] STR(String a){
			String[] sp1 = a.split("[, .]");
			
			
			return sp1;
		}
		/*
		class Data{
			int x;
			double y;
			public Data(int n,double m) {
				this.x = n;
				this.y = m;
			}
		}
		*/
		void doIt(){
			//整数入力
			String n = sc.next();
			//少数入力
			double m = sc.nextDouble();
			System.out.println(STR(n));
			//
			
		}
	}
}