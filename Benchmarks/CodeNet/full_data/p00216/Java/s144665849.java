import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
			int m = 4280;
		while(w != -1){
			int r = 0;
			if(w <= 10){
				r = 1150;
			}else if(w <= 20){
				r = 1150+(w-10)*152;
			}else if(w <= 30){
				r = 1150+10*125+(w-20)*140;
			}else{
				r = 1150+10*125+10*140+(w-30)*160;
			}
			System.out.println(m-r);
			w = scan.nextInt();
		}
	}
}