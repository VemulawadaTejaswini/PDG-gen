import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b=new int[5];
		int c=10;
		int d=0;
		for(int i=0;i<4;i++) {
			b[i]=a%c;
			//System.out.println(b[i]);
			a/=10;
			if(i!=0&&b[i]==b[i-1])d++;
		}
		if(d>=2)System.out.println("Yes");
		else System.out.println("No");
	}
}