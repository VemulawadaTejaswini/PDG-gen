import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double eye_right, eye_left;
	static int a, b, c, d, A, B, C, D;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
		System.out.println(a + " " + A);
		System.out.println(b + " " + B);
		System.out.println(c + " " + C);
		System.out.println(d + " " + D);
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		eye_left = sc.nextDouble();
		eye_right = sc.nextDouble();
		return true;
	}
	static void solve(){
		if(eye_left >= 1.1){
			a++;
		}else if(eye_left >= 0.6){
			b++;
		}else if(eye_left >= 0.2){
			c++;
		}else if(eye_left < 0.2){
			d++;
		}
		
		if(eye_right >= 1.1){
			A++;
		}else if(eye_right >= 0.6){
			B++;
		}else if(eye_right >= 0.2){
			C++;
		}else if(eye_right < 0.2){
			D++;
		}
	}

}