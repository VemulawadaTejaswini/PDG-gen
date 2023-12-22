import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int setnums = scan.nextInt();

		for(int i=0; i<setnums; i++) {
			String str1 = scan.next();
			String str2 = scan.next();
			String longer = "";
			String smaller = "'";
			if(str1.length() > str2.length()) {
				longer = str1;
				smaller = str2;
			}else {
				smaller = str1;
				longer = str2;
			}
			longestSeq(longer, smaller);
		}
		
	}
	
	static void longestSeq(String large, String small) {
		int[][] map = new int[large.length()+1][small.length()+1];
		//System.out.println("mp: " + map[1][1]);
		int seqlength = 0;
		for(int i=0; i<=large.length(); i++){ 
	      for (int j=0; j<=small.length(); j++) { 
	        if (i == 0 || j == 0) {
	            map[i][j] = 0; 
	        } else {
	        	char largeChar = large.charAt(i-1);
	        	char smallChar = small.charAt(j-1);
	        	if (largeChar == smallChar) {
	        		map[i][j] = map[i-1][j-1] + 1; 
	        	} else {
	        		int largeVal = map[i-1][j];
	        		int smallVal = map[i][j-1];
	        		if(largeVal>smallVal){
	        			map[i][j] = map[i-1][j];
	        		} else {
	        			map[i][j] = map[i][j-1];
	        		}
	        	}
	        }
	        seqlength = map[large.length()][small.length()];
	      }
		}
        System.out.println(seqlength);

	}
}
//		for(int i=0; i<small.length(); i++) {
//		for(int j=0; j<large.length(); j++) {
//			
//		}
//	}
//	
			
//	for(int j=0; j<small.length(); j++) {
//		t1 = j;
//		boolean cont = true;
//		//for(int k = 0; k<large)
//		for(int k=0; k<large.length(); k++) {
//			t2 = k;
//		while(cont) {
//			if((small.length() > t1) && (small.charAt(t1) == large.charAt(t2))) {
//				System.out.println(small.charAt(t1) + " t1:" + t1 + " t2:" + t2);
//				current += small.charAt(t1);
//				//System.out.println("here if");
//				t1++;
//				t2++;
//			}else {
//				//System.out.println("here else");
//				cont = false;
//				t1 = 0;
//				t2 = 0;
//			}		
//			if(current.length()>longest.length()) {
//				longest = current;
//			}
//			//System.out.println("cur: " + current);
//		}
//		}
//	}
//	System.out.println("longest: " + longest);

