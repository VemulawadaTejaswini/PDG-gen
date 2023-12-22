import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			double d = sc.nextDouble();
			if(d<0) break;
			if(d>=256){
				System.out.println("NA");
			}else{
				StringBuffer sb = new StringBuffer();
				String s = Integer.toBinaryString((int)d);
				for(int i=0;i<8-s.length();i++) sb.append("0");
				sb.append(s);
				sb.append(".");
				
				double e = d-(int)d;
				double f = 1.0;
				for(int i=0;i<4;i++){
					f/=2;
					if(e>=f){
						sb.append("1");
						e-=f;
					}else{
						sb.append("0");
					}
				}
				if(e==0) System.out.println(sb);
				else System.out.println("NA");
			}
	
		}
	}	
}