import java .util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);int a = sc.nextInt();
		int b = sc.nextInt();
		long c=0;
		if(a==1)
		c=c+300000;
			if(a==2)
		c=c+200000;
			if(a==3)
		c=c+100000;
			if(b==1)
		c=c+300000;
			if(b==2)
		c=c+200000;
			if(b==3)
		c=c+100000;
		if(a==1&&b==1)
		c=c+400000;
System.out.println(c);	}
}