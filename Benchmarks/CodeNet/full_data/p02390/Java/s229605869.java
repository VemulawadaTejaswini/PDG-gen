import java.util.Scanner;

public class Watch {

	static int h,m,s;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		tim(time);


	}
	static void tim(int S){
		if(S>=0 && S<=86400){
			h = S/3600;
			m = (S%3600)/60;
			s = (S%3600)%60;
		}
		System.out.println(h+":"+m+":"+s);

	}

}