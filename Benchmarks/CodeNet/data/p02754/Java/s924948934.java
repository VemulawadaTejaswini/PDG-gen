import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int aCount = 0;
		int nCount=n;
		aCount += n/(a+b)*a;
		if(n%(a+b)>a){
			aCount+=a;
		}else{
			aCount+=n%(a+b);
		}
		System.out.print(aCount);
	}
