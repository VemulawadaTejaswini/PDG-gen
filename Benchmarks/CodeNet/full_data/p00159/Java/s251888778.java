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
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				int num = 0;
				double ans = 1000000;
				for(int i = 0;i < n;i++){
					int num2 = sc.nextInt();
					double m = sc.nextDouble();
					double kg = sc.nextDouble();
					double bmi = (kg / (m * m))*10000;
					if(22 - bmi < 0)bmi = bmi - 22;
					else bmi = 22 - bmi;
					if(ans > bmi){
						ans = bmi;
						num = num2;
					}else if(ans == bmi){
						num = Math.min(num, num2);
					}
				}
				System.out.println(num);
			}
		}
	}
}