import java.util.*;
import java.math.BigDecimal;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(n!=0){

	    BigDecimal a = new BigDecimal(sc.next());
	    BigDecimal b = new BigDecimal(sc.next());
	    BigDecimal sum = a.add(b);

	    if(a.toString().length()>80 || b.toString().length()>80 || sum.toString().length()>80){
		System.out.println("overflow");
	    }else{
		System.out.println(sum);
	    }
	    n--;
	}
    }
}