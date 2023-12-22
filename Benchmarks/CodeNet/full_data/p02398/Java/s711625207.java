import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=0;
do{
	if(c%a==0){
		d++;
	}
	a++;
	if(a>b)break;
}while(true);
System.out.println(d);
scan.close();
	}
}