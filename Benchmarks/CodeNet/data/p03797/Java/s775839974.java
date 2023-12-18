import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
long a=scan.nextInt();
long b=scan.nextInt();
long i=0;
do {
	if(b<=1||a==0) {break;}
	if(a>=1&&b>=2) {i++;a--;b-=2;}
}while(true);
if(b>=4) {i=i+b/4;}
System.out.println(i);
}
}