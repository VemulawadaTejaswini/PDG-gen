
//23:37

import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		char map[] ={'0','2','3','4','5','6','7','8','9','T','J','Q','K','A'};
		int invmap[] = new int[256];
		for(int i =1 ; i < 14;i++){
			invmap[map[i]] = i;
		}
//		System.out.println(Arrays.toString(invmap));
		for (;;) {
			String f = sc.next();
			if (f.equals("#")) {
				break;
			}

			char t = f.charAt(0);
			String[][] c = new String[4][13];
			for(int i =0 ; i < 4; i++){
				for(int j = 0; j < 13; j++){
					c[i][j] = sc.next();
				}
			}
			
			
			int index = 0;
			int pt[] = new int[2];
			for(int i =0 ; i < 13; i ++){
				int index2 = index;
				char mcolor = c[index][i].charAt(1);
				int mvalue = invmap[c[index][i].charAt(0)];
				for(int k = 1 ; k < 4; k++){
					int j = (index+k)%4;
					char color = c[j][i].charAt(1);
					int value = invmap[c[j][i].charAt(0)];
					if(color == t){
						if(mcolor == t){
							if(mvalue < value){
								index2 = j;
								mvalue = value;
							}							
						}else{
							mcolor = color;
							index2 = j;
							mvalue = value;
						}
					}
					if(color != mcolor){
						continue;
					}
					if(mvalue < value){
						index2 = j;
						mvalue = value;
					}
				}
//				System.out.println(index2);
				index = index2;
				pt[index2%2]++;
			}
			if(pt[0] > 6){
				System.out.println("NS "+(pt[0]-6));
			}else{
				System.out.println("EW "+(pt[1]-6));				
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}