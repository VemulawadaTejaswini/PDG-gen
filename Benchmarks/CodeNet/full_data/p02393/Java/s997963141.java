import java.util.Scanner;
public class Main {
	public static void main(String[] kotai) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
	if(a<b) {
if(b<c) {
	System.out.printf("%d %d %d",a,b,c);
}else if(c<a) {
	System.out.printf("%d %d %d",c,a,b);
}else {
	System.out.printf("%d %d %d",a,c,b);
}
	}else {
		if(b>c) {
			System.out.printf("%d %d %d",c,b,a);
		}else if(c>a) {
			System.out.printf("%d %d %d",b,a,c);
		}else {
			System.out.printf("%d %d %d",b,c,a);
		}
	}
}		
}

