import java.util.* ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		String line = in.next() ;
		char f1 = '0' , f2 = '1' ;
		int sum1 = 0 , sum2 = 0 ;
		for(int i=0;i<line.length();i++) {
			if(line.charAt(i)!=f1) {
				sum1++ ;
			}
			if(line.charAt(i)!=f2) {
				sum2++ ;
			}
			f1 = rvs(f1) ;
			f2 = rvs(f2) ;
		}
//		System.out.println(sum1+" "+sum2) ;
		if(sum1>sum2)
			System.out.println(sum2) ;
		else
			System.out.println(sum1) ;
	}

	public static char rvs(char c) {
		if(c=='0')
			return '1' ;
		else
			return '0' ;
	}
	
}
