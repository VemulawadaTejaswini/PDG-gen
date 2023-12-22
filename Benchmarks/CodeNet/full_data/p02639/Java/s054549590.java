import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		var sc = new java.util.Scanner(System.in);

		var a=new BigDecimal[5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextBigDecimal();
		}
		for(int i=0;i<5;i++) {
			if(BigDecimal.ZERO.equals(a[i])) {
				System.out.println((i+1));
				break;
			}
		}
	}
}
