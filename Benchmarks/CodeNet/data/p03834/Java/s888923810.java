import java.util.Scanner;

public class SumOfThreeIntegersBC51Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.next();
      	String ans = "";
      	for (int i = 0; i < x.length(); i++){
        	if (x.charAt(i)==',') ans+=" ";
          	else ans+=x.substring(i,i+1);
        }
      	System.out.println(ans);
	}
}