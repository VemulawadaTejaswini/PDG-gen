import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      BigDecimal x=new BigDecimal("1");
      for(int i=0;i<N;i++){
      	long a=sc.nextLong();
        BigDecimal A=BigDecimal.valueOf(a);
        x=x.multiply(A);
      }
      String y=x.toString();
      String z=y.replaceAll("0","");
      if(y.length()>=19 && !(z=="1")){
      	System.out.println(-1);
      }else{
      	System.out.println(y);
      }
	}
}