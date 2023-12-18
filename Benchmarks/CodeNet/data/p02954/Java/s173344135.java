
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int n = s.length();
		
		char lr[] = new char[n];
		
		lr[0] = 'R';
		for (int i = 1 ; i <n-1 ; i ++) {
			
			lr[i] = s.charAt(i);
		}
		
		lr[n-1] = 'L';
		
		int ch[] = new int [n];
		for(int i = 0 ; i < n ; i ++) {
			ch[i] = 0;
		}

		//int num = 99;
		//自分の乗っている文字がRの場合、直近のLまでの距離を出せば、そことその隣との往復になる。
		//自分の乗っている文字がLの場合、直近のRまでの距離を出せば、そことその人ます右との往復運動になる。
		for (int i = 0 ; i < n ; i ++) {
		
			if (lr[i] == 'R') {
				
				int count = 1;
				
				boolean same = true;
				
				while (same){
					if (lr[i+count] == 'R') {
						count++;
					}else {
						
						same = false;
					};
				};
				
				if ((count)%2 == 0) {
					ch[i + count]++;
					
				}else {
					ch[i+ count -1]++ ;
				};
			}else {
				int count = 1;
				boolean same = true;
				while (same){
					if (lr[i-count] == 'L') {
						count++;
					}else {
						
						same = false;
					};
				};
				if ((count)%2 == 0) {
					ch[i - count]++;
				}else {
					ch[i- count +1] ++ ;
				};
			}
		}
		String re = "";
		for (int i = 0 ; i < n-1 ; i ++) {
			re  += ch[i]+" ";
		}
		re += ch[n-1];
		System.out.println(re);
		
	}
		
}
