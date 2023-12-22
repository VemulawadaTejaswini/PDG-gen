import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a[]=new int[3000];
int b[]=new int[3000];
int x=0;
int y=0;
int i=0;
int count=0;
int count2=0;
do {
	x=scan.nextInt();
	y=scan.nextInt();
	a[i]=x;
	b[i]=y;
	i++;
}while(!(x==0&&y==0));
i=0;
do {
	do{
		if(a[i]==count2){ 
			count2=0;
			break;
			}
		
		do {
		if(b[i]==count){ 
			count=0;
			break;
			}
		System.out.print("#");
		count++;
	}while(true);
	count2++;
	System.out.println();
	}while(true);
		i++;
		System.out.println();
}while(!(a[i]==0&&b[i]==0));
}
}
