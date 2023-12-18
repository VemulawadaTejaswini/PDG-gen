import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=scan.nextInt();
if((a+b)<(c+d)) {
System.out.println("Right");
}
else if((a+b)>(c+d)){
	System.out.println("Left");
}
else {
	System.out.println("Balanced");
}
	}
}