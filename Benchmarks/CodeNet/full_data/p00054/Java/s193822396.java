import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] st = (sc.nextLine()).split(" ");
			BigDecimal a = new BigDecimal(st[0]);
			BigDecimal b = new BigDecimal(st[1]);
			int n = Integer.parseInt(st[2]);
			BigDecimal c = a.divide(b, n, BigDecimal.ROUND_HALF_UP);
			String str2 = c.toString();
			int s = 0;
			boolean f = false;
			for(int i=0, l=str2.length(); i < l; i++){
				if(f){
					s += Integer.parseInt(str2.substring(i, i+1));
				} else {
					if((str2.substring(i, i+1)).equals(".")){
						f = true;
					}
				}
			}
			
			System.out.println(Integer.toString(s));
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}