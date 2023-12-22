import java.util.Scanner;
public class Main{
	int o,h,s,e;
	double q,w,a;
	String  i,l,k;
	Scanner scan=new Scanner(System.in);
	public void output() {
h=scan.nextInt();
o=h%10;
if(o==2||o==4||o==5||o==7||o==9) {
	System.out.println("hon");
}else if(o==0||o==1||o==6||o==8) {
	System.out.println("pon");
}else {
	System.out.println("bon");
}
	}
	public static void main(String[] args) {
		Main p=new Main();
		p.output();
	}
}