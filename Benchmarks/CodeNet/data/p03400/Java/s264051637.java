import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int d[]=new int[a];
	for(int i=0;i<a;i++) {
		d[i]=scan.nextInt();
	}
	for(int i=0;i<a;i++) {
		for(int j=0;;j++) {
			if((d[i]*j+1)<=b) {
				c++;
			}
			else {
				break;
			}
		}
	}
	System.out.println(c);
	scan.close();
}
}