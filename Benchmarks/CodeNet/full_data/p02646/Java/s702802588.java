

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a,b,v,w,t,xa,xb;
		a = scan.nextInt();
		v = scan.nextInt();
		b = scan.nextInt();
		w = scan.nextInt();
		t = scan.nextInt();
		
		boolean canGet = false;
		
		//	trueのとき+方向へ追いかけっこする
			
			//	鬼の方が遅い場合捕まえられない
			if(w >= v) {
				System.out.println("NO");
				return;
			}
			
			if(((b > a) && ((a+(v*t) == b+(w*t)) || ((b > a) && a+(v*(t-1)) > b+(w*(t-1)))))) {
				canGet =true;
			}else if(((a > b) && ((b-(w*t) == a-(v*t)) || ((a > b) && (b-(w*(t-1)) > a-(v*(t-1))))))){
				canGet =true;
			}else {
				canGet =false;
			}
		
		if(canGet) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
