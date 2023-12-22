import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		GetNum test = new GetNum();
		test.ChangeSec();
			
	}
}

class GetNum{
	public void ChangeSec(){
		
			String sec = new Scanner(System.in).nextLine()	;
			int num = Integer.parseInt(sec);
			int test = num / 60;

			int h = test / 60;
			int m = test % 60;
			int s = num % 60;

			System.out.println(h + ":" + m + ":" + s); 

		}
}