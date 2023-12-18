import java.util.*;

class Main{
	public static void main(String[] a){
		String X;
		Scanner in = new Scanner(System.in);
		X = in.next();
		StringBuilder sb = new StringBuilder(X);
		while(sb.toString().contains("ST")){
			L1:for(int i=0; i+1<sb.length(); i++){
				if(sb.charAt(i)=='S'){
					if(sb.charAt(i+1)=='T') {
						sb.delete(i,i+2);
						break L1;
					}
				}
			}
		}
		System.out.println(sb.length());
	}
}