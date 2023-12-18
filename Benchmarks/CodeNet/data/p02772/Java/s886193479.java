import java.util.*;

public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,c1=0;
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			if(a%2==0){
				c++;
				if(a%3==0||a%5==0)
					c1++;
			}
		}
		if(c1!=c)
			System.out.println("DENIED");
		else
			System.out.println("APPROVED");
	}
}