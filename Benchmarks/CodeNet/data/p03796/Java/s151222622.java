import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=1;
int i=1;
do {
	if(i==a+1) {break;}
	b=b*i;
	i++;
}while(true);
int c=b;
c=b%1000000007;
System.out.println(c);
}
}