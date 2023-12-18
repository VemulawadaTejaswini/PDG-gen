import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ans=0;	 int wk1=0; int wk2=0;
		int L=sc.nextInt();	
		int R=sc.nextInt();	
		wk1=L%2019;
		wk2=R%2019;
		ans=(wk1*wk2)%2019;
	
	System.out.println(ans);
	}
}