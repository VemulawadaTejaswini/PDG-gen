import java.util.Scanner;
public class Main {
public static void main(String[] kotai) {
	Scanner a=new Scanner(System.in);
	while(a.hasNext()) {
	int x;
	x=a.nextInt();
	if(x==0 || x>1000) {
		break;
	}else {
int g,s,b,q;
g=x%10;
s=x/10%10;
b=x/100%10;
q=x/1000%10;
int sum;
sum=g+s+b+q;
System.out.println(sum);
}
	}
}
}

