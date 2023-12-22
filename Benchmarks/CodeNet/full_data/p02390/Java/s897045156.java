import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int S = stdIn.nextInt();
		int h,m,s;
			h = S / 3600;
			m = ( S - h * 3600 ) / 60;
			s = S - h * 3600 - m * 60;
		System.out.println(h + ":" + m + ":" + s);
	}

}