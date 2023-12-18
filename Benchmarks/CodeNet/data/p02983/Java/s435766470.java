import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long ans=0;	 long wk1=0; long wk2=0;
		long L=sc.nextInt();	
		long R=sc.nextInt();	
		wk1=L*R;
		ans=(wk1)%2019;
	
	System.out.println(ans);
	}
}