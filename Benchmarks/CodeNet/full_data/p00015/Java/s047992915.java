import java.math.BigDecimal;
import java.util.Scanner;

public class p0015{
	public p0015(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			BigDecimal f = new BigDecimal(sc.next());
			BigDecimal s = new BigDecimal(sc.next());
			
			f = f.add(s);
			String str = f.toString();
			if(str.length() > 80){
				System.out.println("overflow");
			} else {
				System.out.println(str);
			}
		}
	}
	
	public static void main(String[] args){
		p0015 test = new p0015();
	}
}