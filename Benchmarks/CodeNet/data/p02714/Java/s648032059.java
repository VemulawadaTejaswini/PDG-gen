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
		char ch_k;
		
		// 1st point loop
		for (i=0;i<slen-2;i++) {
			for(j=i+1;j<slen-1;j++) {
				if( ary[j] == ary[i])
					continue;
				
				// assign k value
				if (ary[i] == 'R') {
					if (ary[j]=='G') {
						ch_k='B';
					}
					else	//i==B
						ch_k='G';
				}
				else if(ary[i]=='G') {
					if(ary[j]=='R')
						ch_k='B';
					else
						ch_k='R';
					
				}
				else {	// i == B
					if(ary[j]=='R')
						ch_k='G';
					else
						ch_k='R';
				}
				
				// count number of ch_k rest
				for(k=j+1;k<slen;k++){
					if (ch_k == ary[k] && ((j-i) != (k-j))) {
						total++;
					}
				}
			}
		}
		
		
		sc.close();
		log(total);
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
