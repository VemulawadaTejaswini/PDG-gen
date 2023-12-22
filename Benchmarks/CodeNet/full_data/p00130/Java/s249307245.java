import java.awt.geom.*;
import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			String s = sc.next();
			int cap = 4000;
			char [] c = new char[cap];
			Arrays.fill(c, '*');
			int pos = cap / 2;
			int len = s.length();
			for(int i = 0; i < len;){
				char nowc = s.charAt(i);
				if(Character.isLetter(nowc)){
					c[pos] = nowc;
					i++;
				}
				else if(nowc == '-'){
					pos++;
					i = i + 2;
				}
				else{
					pos--;
					i = i + 2;
				}
			}
			String ans = new String(c).replaceAll("\\*+", "");
			System.out.println(ans);
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}