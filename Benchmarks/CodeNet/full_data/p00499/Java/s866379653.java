import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int  l = sc.nextInt();
		int  a = sc.nextInt();
		int  b = sc.nextInt();
		int  c = sc.nextInt();
		int  d = sc.nextInt();
		int l1=a/c;
		int l2=b/d;
		if(a%c!=0) l1+=1;
		if(b%d!=0) l2+=1;
		if(l1<l2) l1=l2;
		System.out.println(l1);
	}
}