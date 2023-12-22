import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a=sc.nextInt();//起きている時間
			int b=sc.nextInt();//寝ている時間
			int c=sc.nextInt();//到着時間
			int r=-1;
			while(c<14400){
				if(c%(a+b)<=a) {
					r=c;
					break;
				}
				c+=60;
			}
			System.out.println(r);

		}
	}
}

