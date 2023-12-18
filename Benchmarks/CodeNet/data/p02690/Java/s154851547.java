import java.util.Scanner;
//TLEコードぶちまけ
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		
		//ａ⁵－ｂ⁵＝(ａ－ｂ)(ａ⁴＋ａ³ｂ＋ａ²ｂ²＋ａｂ³＋ｂ⁴)
		/*if(x==1) {
			System.out.println(0+" "+(-1));
			return;
		}
		*/
		
		for(int i = 0; i <= x; i++) {
			
			int b = Math.abs((int)Math.pow(i, 5)-x);
			
			for(int j = 0; j <= x; j++) {
				if(b==(int)Math.pow(j, 5)) {
					if(Math.pow(i, 5)<x) {
						System.out.println(i+" "+(-j));
						return;
					}else {
						System.out.println(i+" "+j);
						return;
					}
				}
			}
			
			
		}
	}
}
		
		
		
		

