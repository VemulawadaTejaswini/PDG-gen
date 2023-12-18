import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	long lon=scan.nextLong();
	long bis=1;
	int money=0;
	for(int i=0;i!=a;i++) {
		if(i<a-money&&b+1<c&&bis>=b){
			money++;
			bis-=b;
		}
		else if(money>0) {
			bis+=c;
			money--;
		}
		else {
			bis++;
		}
	}
	System.out.println(bis);
}
}