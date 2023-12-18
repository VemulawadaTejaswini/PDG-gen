import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double gyou = sc.nextDouble();
		double retu = sc.nextDouble();
		double num = sc.nextDouble();
		if(gyou / num < retu / num){
			System.out.print(Math.ceil(gyou / num));
		}else{
			System.out.print(Math.ceil(retu / num));
		}
	}
}