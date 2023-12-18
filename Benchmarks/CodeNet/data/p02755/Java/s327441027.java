import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		int R = -1;
		float Rmemo = Math.min((float)(A/0.08), (float)(B/0.1));
		while(Rmemo*0.08 < A + 1) {
			int x = (int)Math.floor(Rmemo*0.08);
			int y = (int)Math.floor(Rmemo*0.1);
			if(x == A && y == B) {
				R = (int)Rmemo;
				break;
			}
			Rmemo++;
		}
		System.out.println(R);
	}
}