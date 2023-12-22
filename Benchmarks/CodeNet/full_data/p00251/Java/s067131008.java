package hoge.hoge.com;
import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) 
		throws java.io.IOException{
		// TODO 自動生成されたメソッド・スタブ


Scanner scan = new Scanner(System.in);
int i=0,a;
for(a=0;a<10;a++){
String str = scan.next();



i += Integer.parseInt(str);
}
System.out.println(+i);

	}
}