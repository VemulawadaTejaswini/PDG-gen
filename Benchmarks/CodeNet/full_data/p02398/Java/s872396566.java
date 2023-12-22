import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d[]=new int[10000];
int x=0;
int i=1;
int i2=0;
do{
if(c%i==0){
	d[x]=i;
	x++;
}
i++;
if(i==c)break;
}while(true);
x=0;
do{
	System.out.println(d[x]);
x++;
}while(true);
	}
}