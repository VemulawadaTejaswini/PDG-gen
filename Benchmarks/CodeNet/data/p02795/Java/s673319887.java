import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int gyou = sc.nextInt();
		int retu = sc.nextInt();
		int num = sc.nextInt();
		if(gyou / num < retu / num){
			System.out.print(Math.ceil(gyou / num));
		}else{
			System.out.print(Math.ceil(retu / num));
		}
	}
}