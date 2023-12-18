import java.util.*;


public class Main {

	// test 4  D
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		char [] ary = s.toCharArray();

		int i,j,k;
		int slen= n;
		int total=0;

		// 1st point loop
		for (i=0;i<slen-2;i++) {
			for(j=i+1;j<slen-1;j++) {
				if( ary[j] == ary[i])
					continue;
				// get k char first
				for(k=j+1;k<slen;k++) {
					if ((ary[k] != ary[j]) && (ary[k] != ary[i])) {
						break;
					}
				}
				if (k>=slen)
					break;
				
				char ch_k = ary[k];
				
				// count number of ch_k rest
				for(;k<slen;k++){
					if (ch_k == ary[k] && ((j-i) != (k-j))) {
						total++;
					}
				}
			}
		}
		
//				for(k=j+1;k<slen;k++) {
//					ch_k = s.charAt(k);
//					if (ch_k==ch_j || ch_k == ch_i)
//						continue;
//					// check length
//					if ((j-i) != (k-j)) {
//						total++;
//					}
//					
//				}
//			}
			
//		}
		
		sc.close();
		log(total);
	}
	
	static int nextRR(int r) {
		int nextR;
		int nextRt;
		
		if ((r+1) <= 10) {
			return r+1;
		}
		
		for(nextRt=r+1;;nextRt++) {
			// put digits into array
			String data = Integer.toString(nextRt);
			char ary2[] = data.toCharArray();
		
			// If this is last matched pattern in same digits
			boolean lastMatchInDigits=true;
			for(int i=0;i<(ary2.length-1);i++) {
				if(ary2[i]+1 == ary2[i+1])
					continue;
				else {
					lastMatchInDigits = false;
					break;
				}
						
			}
			
			if (lastMatchInDigits==true) {
				return nextRt;
			}

			boolean result = true;
			for(int i=0;i<(ary2.length-1);i++) {
				if(Math.abs( ary2[i]-ary2[i+1]) > 1) {
					result = false;
					break;
				}
			}
			
			
			if (result==true) {
				nextR = nextRt;
				break;
			}

		}
		
		return nextR;
	}

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}
	
	
	class Plot{
		int x;
		
	}
}
