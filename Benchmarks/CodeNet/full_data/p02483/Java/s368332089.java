import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int tmp;
if(b < a){
tmp = a; a = b; b = tmp;
}	
	if(c <b){
tmp=b;b=c;c=tmp;
}
if(b < a){
tmp = a; a = b; b = tmp;
}			System.out.printf("%d %d %d\n",a,b,c);
	
	
	}}