import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int gyou = sc.nextInt();
		int retu = sc.nextInt();
		int num = sc.nextInt();
		if(num / gyou < num / retu){
			System.out.print(Math.ceil(num / retu));
		}else{
			System.out.print(Math.ceil(num / gyou));
		}
	}
}