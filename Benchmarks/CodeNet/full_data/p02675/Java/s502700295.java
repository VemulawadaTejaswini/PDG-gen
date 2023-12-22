import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int n=b%10;
		if(n==2||n==4||n==5||n==7||n==9)System.out.println("hon");
		else if(n==1||n==6||n==8||n==0)System.out.println("pon");
		else System.out.println("bon");
	}

}
