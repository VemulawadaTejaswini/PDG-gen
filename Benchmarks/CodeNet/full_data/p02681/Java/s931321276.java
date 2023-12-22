import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=sc.nextInt();
		
		if(k-a<=0){
			System.out.println(a);
		}
		else {
			if(k-a-b<=0){
				k-=a;
				k-=b;
				System.out.println(a);
			}
			else {
				if(k-a-b-c<0){
					k-=a;
					k-=b;
					System.out.println(a+k*(-1));
				}
			}
		}
	}
}
