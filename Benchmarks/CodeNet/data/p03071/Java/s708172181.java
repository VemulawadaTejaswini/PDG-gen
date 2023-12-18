import java.util.*;
import java.lang.*;
import java.io.*;
class Unique {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);

	int a,b;
	a=input.nextInt();
	b=input.nextInt();

	int x=a-1;
	int y=b-1;
	int p=Math.max(a*2-1,b*2-1);
	int q=Math.max(p,x+b);
	int m=Math.max(q, y+a);
	int n=Math.max(m, a+b);
			System.out.println(n);
}
}
