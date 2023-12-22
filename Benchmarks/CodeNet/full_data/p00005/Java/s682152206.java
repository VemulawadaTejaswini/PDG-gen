import java.util.Scanner;


public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long num1,num2,gc1,gc2,lc1,lc2;

		while(sc.hasNextInt()){
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if(num1 >= num2){
				gc1 = num1;gc2 = num2;
				lc1 = num1;lc2 = num2;
			}else{
				gc1 = num2;gc2 = num1;
				lc1 = num2;lc2 = num1;
			}						//xx1?????§?????????xx2????°??????????????????£??\???
			long GCD,LCM;
			while(gc1 % gc2 != 0){
				GCD = gc1 % gc2;
				gc1 = gc2;
				gc2 = GCD;
			}
			LCM = (lc1*lc2)/gc2;
			System.out.println(gc2 + " " + LCM);
		}
		sc.close();
	}
}