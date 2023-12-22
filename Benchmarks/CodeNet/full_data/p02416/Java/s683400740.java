import java.util.Scanner;
public class Main {
public static void main(String[] kotai) {
	Scanner a=new Scanner(System.in);
	while(a.hasNext()) {
	int x;
	x=a.nextInt();
	if(x==0) {
		break;
	}else {
int gw,sw,bw,qw,ww;
gw=x%10;
sw=x/10%10;
bw=x/100%10;
qw=x/1000%10;
int average,sum;
sum=gw+sw+bw+qw;
System.out.println(sum);
}
	}
}
}
