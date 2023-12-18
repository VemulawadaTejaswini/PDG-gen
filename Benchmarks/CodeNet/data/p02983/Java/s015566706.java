import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		   int L = sc.nextInt();
		   int R = sc.nextInt();
		   while(L>=2019) {
			   L -= 2019;
			   R -= 2019;
		   }
		   if(R>=2019) {
			   System.out.println(0);
		   }else{
			   while(L>=673) {
				   L -= 673;
				   R -= 673;
			   }
			   if(R<=673) {
				   System.out.println(0);
			   }else {
				   int ans = L*(L+1);
				   System.out.println(ans%2019);
			   }
		   }
		    sc.close();
	}
}