import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int c = 0;
			String str = String.valueOf(n);
			
			BigDecimal bd = new BigDecimal(str);
			for(int i = n-1, j = 0; i > 1; i--){
				str = String.valueOf(i);
				if(i % 10 == 0){
					for(j = str.length()-1; str.substring(j, j+1).equals("0");c++, j--);
					str = str.substring(0, j+1);
				}
				bd = bd.multiply(new BigDecimal(str));
			}
			str = bd.toString();
			
			for(int i = str.length()-1; str.substring(i, i+1).equals("0"); c++, i--);
			
			System.out.println(Integer.toString(c));
		}
	}

	public static void main(String[] args){
		new Main();
	}
}