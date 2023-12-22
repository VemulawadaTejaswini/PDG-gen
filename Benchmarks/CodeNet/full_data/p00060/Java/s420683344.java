import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(sc.hasNext()){
			new AOJ().doIt();
		}
	}
	class AOJ{
		void doIt(){
			boolean card[] = new boolean[10];
			int C1 = Integer.parseInt(sc.next());
			int C2 = Integer.parseInt(sc.next());
			int C3 = Integer.parseInt(sc.next());
			card[C1 - 1] = true;
			card[C2 - 1] = true;
			card[C3 - 1] = true;
			
			int my_C = C1 + C2;
			int your_C = C3;
			
			int cnt = 0;
			for(int i = 0;i < 10;i++){
				if(!card[i]){
					if(my_C + i + 1 <= 20)cnt++;
				}
			}
			
			if(cnt < 4)System.out.println("NO");
			else System.out.println("YES");
		}
	}
}