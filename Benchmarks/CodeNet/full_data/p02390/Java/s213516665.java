import java.util.Scanner;


public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int second = sc.nextInt();
		sc.close();

		int h = 0,m = 0,s = 0;

		if(second != 0){
			h = (int)(Math.floor(second / 3600));
			m = (int)(Math.floor(second / 60)) % 60;
			s = second % 60;
		}
		System.out.println(h+":"+m+":"+s);
	}

}