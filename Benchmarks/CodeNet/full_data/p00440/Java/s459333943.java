import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int k = stdIn.nextInt();
			if(n == 0 && k == 0) break;
			boolean[] tmp = new boolean[n+1];
			int sum = 0;
			for(int i = 0; i < k; i++) {
				int s = stdIn.nextInt();
				if(s == 0) {
					sum++;
				}
				tmp[s] = true;
			}
			int max = 0;
			int lp = 1;
			int rp = 1;
			int prelp = 1;
			int tmpsum = sum;
			while(true) {
				if(!tmp[rp]) {
					rp++;
					lp++;
				}
				else {
					break;
				}
			}
			while(true) {
				rp++;
				while(rp < tmp.length && (tmp[rp] ||tmpsum > 0)) {
					if(!tmp[rp] || rp > tmp.length) {
						prelp = rp;
						tmpsum--;
					}
					rp++;
				}
				tmpsum = sum;
				if(rp - lp > max) {
					max = rp - lp;
				}
				
				if(lp > tmp.length || rp > tmp.length) {
					break;
				}
				lp = prelp+1;
				rp = lp+1;
				prelp++;
			}
			if(sum == 0) {
				System.out.println(max-2);
			}
			else 
			System.out.println(max-1);
			
		}
		
	}

}