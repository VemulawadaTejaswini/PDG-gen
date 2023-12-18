import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	 public static void main(String args[]){
		 Scanner std = new Scanner(System.in);
		 int n = std.nextInt();
		 int k = std.nextInt();
		 BigDecimal ans = new BigDecimal("0").setScale(15,BigDecimal.ROUND_UNNECESSARY);
		 BigDecimal one = new BigDecimal("1").setScale(15,BigDecimal.ROUND_UNNECESSARY);
		 BigDecimal nb = new BigDecimal(n).setScale(15,BigDecimal.ROUND_UNNECESSARY);
		 for(int i=1;i<n+1;i++) {
			 if(i>=k) {
				 BigDecimal temp = one.divide(nb,15,BigDecimal.ROUND_UNNECESSARY);
				 ans = ans.add(temp);
			 }
			 else {
				 long num = (long) Math.pow(2,log(i,k));
				 BigDecimal numb = BigDecimal.valueOf(num).setScale(15,BigDecimal.ROUND_UNNECESSARY);
				 numb = one.divide(numb,15,BigDecimal.ROUND_UNNECESSARY);
				 numb = numb.divide(nb,15,BigDecimal.ROUND_UNNECESSARY);
				 ans = ans.add(numb);
			 }
		 }
		 System.out.println(ans);
	 }
	 static long log(int i,int k) {
		 long a = (long)i;
		 for(int j=1;j<k;j++) {
			 a = a*2;
			 if(a>k) {
				 return j;
			 }
		 }
		 System.out.println("error");
		 return 0;
	 }
}
