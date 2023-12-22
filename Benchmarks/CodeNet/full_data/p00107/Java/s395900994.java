import java.util.Scanner;
 
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj107().doIt();
	}
	class aoj107{
		boolean ans(int a,int b,double r){
			for(double i = 0;i < 90;i++){
				double sin = 2*r*Math.sin(Math.toRadians(i));
				double cos = 2*r*Math.cos(Math.toRadians(i));
				if(a < sin && b < cos)return true;
			}
			return false;
		}
		void doIt() {
			while(true){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				if(a+b+c == 0)break;
				int cnt = sc.nextInt();
				for(int i = 0;i < cnt;i++){
					double r = sc.nextDouble();
					if(ans(a,b,r)){
						System.out.println("OK");
					}else if(ans(b,a,r)){
						System.out.println("OK");
					}else if(ans(c,a,r)){
						System.out.println("OK");
					}else if(ans(a,c,r)){
						System.out.println("OK");
					}else if(ans(c,b,r)){
						System.out.println("OK");
					}else if(ans(b,c,r)){
						System.out.println("OK");
					}else{
						System.out.println("NA");
					}
				}
			}
		}
	}
}