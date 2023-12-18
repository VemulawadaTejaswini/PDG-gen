import java.util.*;
public class Resale{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		if((A*B)%%2==1){
			System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}