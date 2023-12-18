import java.util.*;

import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int K = cin.nextInt();
		int Lunlun[] = new int[110000];
		int j = 0;
		for(int i = 1;i <= 100000;i++) {
			boolean flag = true;
			int Bit = i;
			if(Bit>10) {
				while(Bit>10) {
					if(Math.abs((Bit%10)-((Bit/10)%10))>1) flag = false;
					Bit /= 10;
				}
			}
			if(flag) {
				Lunlun[j++] = i;
			}
		}
		
		System.out.println(Lunlun[K-1]);
		

	}

}
