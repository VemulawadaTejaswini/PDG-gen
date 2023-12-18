import java.util.*;
 
class Main{
	public static void main(String[] a){
		String X;
		Scanner in = new Scanner(System.in);
		X = in.next();
		StringBuilder sb = new StringBuilder(X);
		L2:while(true){
			L1:for(int i=0; i+1<sb.length(); i++){
				if((sb.charAt(i)=='S')&&(sb.charAt(i+1)=='T')){
					sb.delete(i,i+2);
					if(!sb.toString().contains("ST")) break L2;
					break L1;
				}
			}
		}
		System.out.println(sb.length());
	}
}